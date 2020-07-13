using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using NMF.Models;
using NMF.Models.Meta;
using NMF.Models.Repository;
using NMF.Synchronizations;

namespace TTC2020.Roundtrip.NMFSolution
{
    public class Migration<TOld, TNew> : ReflectiveSynchronization
    {
        private static Model oldModel = MetaRepository.Instance.ResolveClass(typeof(TOld)).Model;
        private static Model newModel = MetaRepository.Instance.ResolveClass(typeof(TNew)).Model;
        protected override IEnumerable<SynchronizationRuleBase> CreateDefaultSynchronizationRules()
        {
            foreach (var oldClass in oldModel.Descendants().OfType<IClass>())
            {
                var newClass = newModel.Descendants().OfType<IClass>().FirstOrDefault(c => c.Name == oldClass.Name);
                if (newClass != null)
                {
                    var oldMapping = oldClass.GetExtension<MappedType>();
                    var newMapping = newClass.GetExtension<MappedType>();

                    if (oldMapping?.SystemType != null && newMapping?.SystemType != null)
                    {
                        var rule = (SynchronizationRuleBase)Activator.CreateInstance(typeof(MigrationRule<,>).MakeGenericType(oldMapping.SystemType, newMapping.SystemType));
                        yield return rule;
                    }
                }
            }
        }
    }
}
