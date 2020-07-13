﻿using System;
using CommandLine;
using NMF.Models.Repository;
using NMF.Synchronizations;
using NMF.Transformations;
using TTC2020.Roundtrip.NMFSolution;

namespace TTC2020.Roundtrip
{
    class Program
    {
        static void Main(string[] args)
        {
            Parser.Default.ParseArguments(args,
                typeof(Scenario1Forward),
                typeof(Scenario1Backward),
                typeof(Scenario2Forward),
                typeof(Scenario2Backward),
                typeof(Scenario3Forward),
                typeof(Scenario3Backward),
                typeof(Scenario4Forward),
                typeof(Scenario4Backward))
                .MapResult((Verb v) => v.TryRun(), _ => 2);
        }
    }

    abstract class Verb
    {
        [Value(0)]
        public string Input { get; set; }

        [Value(1)]
        public string Output { get; set; }

        protected T LoadModel<T>(ModelRepository repository) where T : class
        {
            var model = repository.Resolve(Input);
            return model.RootElements[0] as T;
        }

        internal int TryRun()
        {
            try
            {
                Run();
                return 0;
            }
            catch (Exception e)
            {
                Console.Error.WriteLine(e);
                return 1;
            }
        }

        public abstract void Run();
    }

    [Verb("scenario1-forward", HelpText = "Runs scenario 1 forward, i.e. apply changes to V1 model to V2")]
    class Scenario1Forward : Verb
    {
        public override void Run()
        {
            var repository = new ModelRepository();
            var input = LoadModel<Scenario1.V1.Model.IPerson>(repository);

            var transformation = new Scenario1Solution();
            transformation.Initialize();

            Scenario1.V2.Model.IPerson result = null;
            transformation.Synchronize(ref input, ref result, SynchronizationDirection.LeftToRightForced, ChangePropagationMode.None);
            transformation.Synchronize(ref input, ref result, SynchronizationDirection.RightToLeftForced, ChangePropagationMode.None);

            repository.Save(input, Output);
        }
    }

    [Verb("scenario1-backward", HelpText = "Runs scenario 1 backward, i.e. apply changes to V2 model to V1")]
    class Scenario1Backward : Verb
    {
        public override void Run()
        {
            var repository = new ModelRepository();
            var input = LoadModel<Scenario1.V2.Model.IPerson>(repository);

            var transformation = new Scenario1Solution();
            transformation.Initialize();

            Scenario1.V1.Model.IPerson result = null;
            transformation.Synchronize(ref result, ref input, SynchronizationDirection.RightToLeftForced, ChangePropagationMode.None);
            transformation.Synchronize(ref result, ref input, SynchronizationDirection.LeftToRightForced, ChangePropagationMode.None);

            repository.Save(input, Output);
        }
    }

    [Verb("scenario2-forward", HelpText = "Runs scenario 2 forward, i.e. apply changes to V1 model to V2")]
    class Scenario2Forward : Verb
    {
        public override void Run()
        {
            var repository = new ModelRepository();
            var input = LoadModel<Scenario2.V1.Model.IPerson>(repository);

            var transformation = new Scenario2Solution();
            transformation.Initialize();

            Scenario2.V2.Model.IPerson result = null;
            transformation.Synchronize(ref input, ref result, SynchronizationDirection.LeftToRightForced, ChangePropagationMode.None);
            transformation.Synchronize(ref input, ref result, SynchronizationDirection.RightToLeftForced, ChangePropagationMode.None);

            repository.Save(input, Output);
        }
    }

    [Verb("scenario2-backward", HelpText = "Runs scenario 2 backward, i.e. apply changes to V2 model to V1")]
    class Scenario2Backward : Verb
    {
        public override void Run()
        {
            var repository = new ModelRepository();
            var input = LoadModel<Scenario2.V2.Model.IPerson>(repository);

            var transformation = new Scenario2Solution();
            transformation.Initialize();

            Scenario2.V1.Model.IPerson result = null;
            transformation.Synchronize(ref result, ref input, SynchronizationDirection.RightToLeftForced, ChangePropagationMode.None);
            transformation.Synchronize(ref result, ref input, SynchronizationDirection.LeftToRightForced, ChangePropagationMode.None);

            repository.Save(input, Output);
        }
    }

    [Verb("scenario3-forward", HelpText = "Runs scenario 3 forward, i.e. apply changes to V1 model to V2")]
    class Scenario3Forward : Verb
    {
        public override void Run()
        {
            var repository = new ModelRepository();
            var input = LoadModel<Scenario3.V1.Model.IPerson>(repository);

            var transformation = new Scenario3Solution();
            transformation.Initialize();

            Scenario3.V2.Model.IPerson result = null;
            transformation.Synchronize(ref input, ref result, SynchronizationDirection.LeftToRightForced, ChangePropagationMode.None);
            transformation.Synchronize(ref input, ref result, SynchronizationDirection.RightToLeftForced, ChangePropagationMode.None);

            repository.Save(input, Output);
        }
    }

    [Verb("scenario3-backward", HelpText = "Runs scenario 3 backward, i.e. apply changes to V2 model to V1")]
    class Scenario3Backward : Verb
    {
        public override void Run()
        {
            var repository = new ModelRepository();
            var input = LoadModel<Scenario3.V2.Model.IPerson>(repository);

            var transformation = new Scenario3Solution();
            transformation.Initialize();

            Scenario3.V1.Model.IPerson result = null;
            transformation.Synchronize(ref result, ref input, SynchronizationDirection.RightToLeftForced, ChangePropagationMode.None);
            transformation.Synchronize(ref result, ref input, SynchronizationDirection.LeftToRightForced, ChangePropagationMode.None);

            repository.Save(input, Output);
        }
    }

    [Verb("scenario4-forward", HelpText = "Runs scenario 4 forward, i.e. apply changes to V1 model to V2")]
    class Scenario4Forward : Verb
    {
        public override void Run()
        {
            var repository = new ModelRepository();
            var input = LoadModel<Scenario4.V1.Model.IContainer>(repository);

            var transformation = new Scenario4Solution();
            transformation.Initialize();

            Scenario4.V2.Model.IContainer result = null;
            transformation.Synchronize(ref input, ref result, SynchronizationDirection.LeftToRightForced, ChangePropagationMode.None);
            transformation.Synchronize(ref input, ref result, SynchronizationDirection.RightToLeftForced, ChangePropagationMode.None);

            repository.Save(input, Output);
        }
    }

    [Verb("scenario4-backward", HelpText = "Runs scenario 4 backward, i.e. apply changes to V2 model to V1")]
    class Scenario4Backward : Verb
    {
        public override void Run()
        {
            var repository = new ModelRepository();
            var input = LoadModel<Scenario4.V2.Model.IContainer>(repository);

            var transformation = new Scenario4Solution();
            transformation.Initialize();

            Scenario4.V1.Model.IContainer result = null;
            transformation.Synchronize(ref result, ref input, SynchronizationDirection.RightToLeftForced, ChangePropagationMode.None);
            transformation.Synchronize(ref result, ref input, SynchronizationDirection.LeftToRightForced, ChangePropagationMode.None);

            repository.Save(input, Output);
        }
    }
}
