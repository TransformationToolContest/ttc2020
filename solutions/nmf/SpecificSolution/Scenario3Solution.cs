using NMF.Expressions;
using NMF.Synchronizations;

using V1Person = TTC2020.Roundtrip.Scenario3.V1.Model.Person;
using V2Person = TTC2020.Roundtrip.Scenario3.V2.Model.Person;

namespace TTC2020.Roundtrip
{
    public class Scenario3Solution : ReflectiveSynchronization
    {
        public class Person2Person : SynchronizationRule<V1Person, V2Person>
        {
            public override void DeclareSynchronization()
            {
                Synchronize(p => p.Name, p => Coalesce(p.Name));
            }
        }

        [LensPut(typeof(Scenario3Solution), nameof(CoalesceBack))]
        public static string Coalesce(string value)
        {
            return value ?? "";
        }

        public static string CoalesceBack(string value, string coalesced)
        {
            return coalesced;
        }
    }
}
