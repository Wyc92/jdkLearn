package com.sun.corba.se.PortableActivationIDL.RepositoryPackage;


/**
* com/sun/corba/se/PortableActivationIDL/RepositoryPackage/AppNamesHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /scratch/jenkins/workspace/8-2-build-linux-amd64/jdk8u271/605/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* Wednesday, September 16, 2020 5:02:54 PM GMT
*/


/** Type used for a list of application names
	*/
public final class AppNamesHolder implements org.omg.CORBA.portable.Streamable
{
  public String value[] = null;

  public AppNamesHolder ()
  {
  }

  public AppNamesHolder (String[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = com.sun.corba.se.PortableActivationIDL.RepositoryPackage.AppNamesHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    com.sun.corba.se.PortableActivationIDL.RepositoryPackage.AppNamesHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return com.sun.corba.se.PortableActivationIDL.RepositoryPackage.AppNamesHelper.type ();
  }

}
