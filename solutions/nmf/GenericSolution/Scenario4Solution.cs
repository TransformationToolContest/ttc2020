using System;
using System.Collections.Generic;
using System.Text;
using NMF.Transformations;
using V1 = TTC2020.Roundtrip.Scenario4.V1.Model;
using V2 = TTC2020.Roundtrip.Scenario4.V2.Model;

namespace TTC2020.Roundtrip.NMFSolution
{
    public class Scenario4Solution : Migration<V1.Container, V2.Container>
    {
        [OverrideRule]
        public class Person2Person : MigrationRule<V1.IPerson, V2.IPerson>
        {
            public override void DeclareSynchronization()
            {
                base.DeclareSynchronization();
                Synchronize(p => p.Age, p => 2020 - p.Ybirth);
            }
        }
    }
}
