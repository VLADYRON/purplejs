package org.purplejs.engine;

import org.purplejs.resource.ResourcePath;
import org.purplejs.value.ScriptExports;

public interface Engine
{
    ScriptExports execute( ResourcePath path );

    // Response execute( ScriptExports exports, Request request );


}
