package com.sun.corba.se.PortableActivationIDL;


/**
* com/sun/corba/se/PortableActivationIDL/ServerProxyOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /scratch/jenkins/workspace/8-2-build-linux-amd64/jdk8u271/605/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* Wednesday, September 16, 2020 5:02:54 PM GMT
*/


/** Server callback interface, passed to Activator in registerServer method.
    */
public interface ServerProxyOperations 
{

  /** Shutdown this server.  Returns after orb.shutdown() completes.
  	*/
  void shutdown ();

  /** Install the server.  Returns after the install hook completes
  	* execution in the server.
  	*/
  void install ();

  /** Uninstall the server.  Returns after the uninstall hook
  	* completes execution.
  	*/
  void uninstall ();
} // interface ServerProxyOperations
