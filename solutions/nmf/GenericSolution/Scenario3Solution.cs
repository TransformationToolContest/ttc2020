using System;
using System.Collections.Generic;
using System.Text;
using NMF.Expressions;
using NMF.Transformations;
using V1Person = TTC2020.Roundtrip.Scenario3.V1.Model.IPerson;
using V2Person = TTC2020.Roundtrip.Scenario3.V2.Model.IPerson;

namespace TTC2020.Roundtrip.NMFSolution
{
    public class Scenario3Solution : Migration<V1Person, V2Person>
    {
        [OverrideRule]
        public class Person2Person : MigrationRule<V1Person, V2Person>
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
