package org.omg.PortableServer.POAPackage;


/**
* org/omg/PortableServer/POAPackage/ObjectNotActive.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /HUDSON/workspace/8-2-build-linux-amd64/jdk8u77/6540/corba/src/share/classes/org/omg/PortableServer/poa.idl
* Sunday, March 20, 2016 10:01:25 PM PDT
*/

public final class ObjectNotActive extends org.omg.CORBA.UserException
{

  public ObjectNotActive ()
  {
    super(ObjectNotActiveHelper.id());
  } // ctor


  public ObjectNotActive (String $reason)
  {
    super(ObjectNotActiveHelper.id() + "  " + $reason);
  } // ctor

} // class ObjectNotActive
