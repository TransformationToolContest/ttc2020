using System;
using System.Collections.Generic;
using System.Text;

using V1Person = TTC2020.Roundtrip.Scenario2.V1.Model.IPerson;
using V2Person = TTC2020.Roundtrip.Scenario2.V2.Model.IPerson;

namespace TTC2020.Roundtrip.NMFSolution
{
    public class Scenario2Solution : Migration<V1Person, V2Person>
    {
    }
}
