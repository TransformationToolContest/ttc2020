using System;
using System.Collections.Generic;
using System.Text;
using NMF.Transformations;
using V1Person = TTC2020.Roundtrip.Scenario1.V1.Model.IPerson;
using V2Person = TTC2020.Roundtrip.Scenario1.V2.Model.IPerson;

namespace TTC2020.Roundtrip.NMFSolution
{
    public partial class Scenario1Solution : Migration<V1Person, V2Person>
    {
        [OverrideRule]
        public class Person2Person : MigrationRule<V1Person, V2Person>
        {
            public override void DeclareSynchronization()
            {
                base.DeclareSynchronization();
                Synchronize(p => p.Age, p => 2020 - p.Ybirth);
            }
        }
    }
}
