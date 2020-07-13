//------------------------------------------------------------------------------
// <auto-generated>
//     Dieser Code wurde von einem Tool generiert.
//     Laufzeitversion:4.0.30319.42000
//
//     Änderungen an dieser Datei können falsches Verhalten verursachen und gehen verloren, wenn
//     der Code erneut generiert wird.
// </auto-generated>
//------------------------------------------------------------------------------

using NMF.Collections.Generic;
using NMF.Collections.ObjectModel;
using NMF.Expressions;
using NMF.Expressions.Linq;
using NMF.Models;
using NMF.Models.Collections;
using NMF.Models.Expressions;
using NMF.Models.Meta;
using NMF.Models.Repository;
using NMF.Serialization;
using NMF.Utilities;
using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.ComponentModel;
using System.Diagnostics;
using System.Linq;

namespace TTC2020.Roundtrip.Scenario4.V2.Model
{
    
    
    /// <summary>
    /// The public interface for Container
    /// </summary>
    [DefaultImplementationTypeAttribute(typeof(Container))]
    [XmlDefaultImplementationTypeAttribute(typeof(Container))]
    [ModelRepresentationClassAttribute("http://ttc2020/model/scenario4/2.0#//Container")]
    public interface IContainer : IModelElement
    {
        
        /// <summary>
        /// The person property
        /// </summary>
        [BrowsableAttribute(false)]
        [XmlElementNameAttribute("person")]
        [XmlAttributeAttribute(false)]
        [ContainmentAttribute()]
        IPerson Person
        {
            get;
            set;
        }
        
        /// <summary>
        /// The dog property
        /// </summary>
        [BrowsableAttribute(false)]
        [XmlElementNameAttribute("dog")]
        [XmlAttributeAttribute(false)]
        [ContainmentAttribute()]
        IDog Dog
        {
            get;
            set;
        }
        
        /// <summary>
        /// Gets fired before the Person property changes its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> PersonChanging;
        
        /// <summary>
        /// Gets fired when the Person property changed its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> PersonChanged;
        
        /// <summary>
        /// Gets fired before the Dog property changes its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> DogChanging;
        
        /// <summary>
        /// Gets fired when the Dog property changed its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> DogChanged;
    }
}

