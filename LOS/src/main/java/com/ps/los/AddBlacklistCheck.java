package com.ps.los;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class AddBlacklistCheck implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("Add Blacklist Check")
   private java.util.List<com.ps.los.BlacklistCheck> addBlacklistCheck;

   public AddBlacklistCheck()
   {
   }

   public java.util.List<com.ps.los.BlacklistCheck> getAddBlacklistCheck()
   {
      return this.addBlacklistCheck;
   }

   public void setAddBlacklistCheck(
         java.util.List<com.ps.los.BlacklistCheck> addBlacklistCheck)
   {
      this.addBlacklistCheck = addBlacklistCheck;
   }

   public AddBlacklistCheck(
         java.util.List<com.ps.los.BlacklistCheck> addBlacklistCheck)
   {
      this.addBlacklistCheck = addBlacklistCheck;
   }

}