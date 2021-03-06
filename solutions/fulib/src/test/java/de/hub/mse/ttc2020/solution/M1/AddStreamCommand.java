package de.hub.mse.ttc2020.solution.M1;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class AddStreamCommand extends ModelCommand
{

   public static final String PROPERTY_incommingRoute = "incommingRoute";

   private String incommingRoute;

   public String getIncommingRoute()
   {
      return incommingRoute;
   }

   public AddStreamCommand setIncommingRoute(String value)
   {
      if (value == null ? this.incommingRoute != null : ! value.equals(this.incommingRoute))
      {
         String oldValue = this.incommingRoute;
         this.incommingRoute = value;
         firePropertyChange("incommingRoute", oldValue, value);
      }
      return this;
   }

   public static final String PROPERTY_outgoingUrl = "outgoingUrl";

   private String outgoingUrl;

   public String getOutgoingUrl()
   {
      return outgoingUrl;
   }

   public AddStreamCommand setOutgoingUrl(String value)
   {
      if (value == null ? this.outgoingUrl != null : ! value.equals(this.outgoingUrl))
      {
         String oldValue = this.outgoingUrl;
         this.outgoingUrl = value;
         firePropertyChange("outgoingUrl", oldValue, value);
      }
      return this;
   }

   public boolean preCheck(M1Editor editor) {
      if (this.getTime() == null) {
         this.setTime(editor.getTime());
      }
      RemoveCommand oldRemove = editor.getRemoveCommands().get("AddStreamCommand-" + this.getId());
      if (oldRemove != null) {
         return false;
      }
      ModelCommand oldCommand = editor.getActiveCommands().get("AddStreamCommand-" + this.getId());
      if (oldCommand != null && java.util.Objects.compare(oldCommand.getTime(), this.getTime(), (a,b) -> a.compareTo(b)) >= 0) {
         return false;
      }
      editor.getActiveCommands().put("AddStreamCommand-" + this.getId(), this);
      return true;
   }

   public Object run(M1Editor editor) {
      CommandStream stream = editor.getService().getStream(incommingRoute);
      stream.getTargetUrlList().add(outgoingUrl);
      return null;
   }

   protected PropertyChangeSupport listeners = null;

   public boolean firePropertyChange(String propertyName, Object oldValue, Object newValue)
   {
      if (listeners != null)
      {
         listeners.firePropertyChange(propertyName, oldValue, newValue);
         return true;
      }
      return false;
   }

   public boolean addPropertyChangeListener(PropertyChangeListener listener)
   {
      if (listeners == null)
      {
         listeners = new PropertyChangeSupport(this);
      }
      listeners.addPropertyChangeListener(listener);
      return true;
   }

   public boolean addPropertyChangeListener(String propertyName, PropertyChangeListener listener)
   {
      if (listeners == null)
      {
         listeners = new PropertyChangeSupport(this);
      }
      listeners.addPropertyChangeListener(propertyName, listener);
      return true;
   }

   public boolean removePropertyChangeListener(PropertyChangeListener listener)
   {
      if (listeners != null)
      {
         listeners.removePropertyChangeListener(listener);
      }
      return true;
   }

   public boolean removePropertyChangeListener(String propertyName,PropertyChangeListener listener)
   {
      if (listeners != null)
      {
         listeners.removePropertyChangeListener(propertyName, listener);
      }
      return true;
   }

   @Override
   public String toString()
   {
      StringBuilder result = new StringBuilder();

      result.append(" ").append(this.getIncommingRoute());
      result.append(" ").append(this.getOutgoingUrl());


      return result.substring(1);
   }

}
