using NMF.Synchronizations;

using V1 = TTC2020.Roundtrip.Scenario4.V1.Model;
using V2 = TTC2020.Roundtrip.Scenario4.V2.Model;

namespace TTC2020.Roundtrip
{
    public class Scenario4Solution : ReflectiveSynchronization
    {
        public class Person2Person : SynchronizationRule<V1.IPerson, V2.IPerson>
        {
            public override void DeclareSynchronization()
            {
                Synchronize(p => p.Name, p => p.Name);
                Synchronize(p => p.Age, p => 2020 - p.Ybirth);
            }
        }

        public class Container2Container : SynchronizationRule<V1.Container, V2.Container>
        {
            public override void DeclareSynchronization()
            {
                Synchronize(SyncRule<Person2Person>(), c => c.Person, c => c.Person);
                Synchronize(SyncRule<Dog2Dog>(), c => c.Dog, c => c.Dog);
            }
        }

        public class Dog2Dog : SynchronizationRule<V1.IDog, V2.IDog>
        {
            public override void DeclareSynchronization()
            {
                Synchronize(d => d.Name, d => d.Name);
                Synchronize(SyncRule<Person2Person>(), d => d.Owner, d => d.Owner);
            }
        }
    }
}
