package org.omg.PortableServer.POAPackage;


/**
* org/omg/PortableServer/POAPackage/AdapterNonExistent.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u171/10807/corba/src/share/classes/org/omg/PortableServer/poa.idl
* Wednesday, March 28, 2018 4:07:50 PM PDT
*/

public final class AdapterNonExistent extends org.omg.CORBA.UserException
{

  public AdapterNonExistent ()
  {
    super(AdapterNonExistentHelper.id());
  } // ctor


  public AdapterNonExistent (String $reason)
  {
    super(AdapterNonExistentHelper.id() + "  " + $reason);
  } // ctor

} // class AdapterNonExistent
