/*******************************************************************************
 * Copyright (c) 2017, 2018 (teslanet.nl) Rogier Cobben.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Public License - v 2.0 which accompany this distribution.
 * 
 * The Eclipse Public License is available at
 *    http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *    (teslanet.nl) Rogier Cobben - initial creation
 ******************************************************************************/

package nl.teslanet.mule.transport.coap.server.config;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.mule.api.annotations.Configurable;
import org.mule.api.annotations.display.FriendlyName;
import org.mule.api.annotations.display.Placement;
import org.mule.api.annotations.param.Optional;


public class ResourceConfig
{
    private String name= null;

    @Placement(group= "Methods")
    private boolean get= true;

    @Placement(group= "Methods")
    private boolean post= false;

    @Placement(group= "Methods")
    private boolean put= false;

    @Placement(group= "Methods")
    private boolean delete= false;

    @Placement(group= "Methods")
    private boolean observe= false;

    private boolean earlyAck= false;

    @Optional
    private String size;

    @Optional
    private String type;


    @Configurable
    @Optional
    private List< ResourceConfig > resources;


    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name= name;
    }

    /**
     * @return the get
     */
    public boolean isGet()
    {
        return get;
    }

    /**
     * @param get the get to set
     */
    public void setGet( boolean get )
    {
        this.get= get;
    }

    /**
     * @return the post
     */
    public boolean isPost()
    {
        return post;
    }

    /**
     * @param post the post to set
     */
    public void setPost( boolean post )
    {
        this.post= post;
    }

    /**
     * @return the put flag
     */
    public boolean isPut()
    {
        return put;
    }

    /**
     * @param put the put to set
     */
    public void setPut( boolean put )
    {
        this.put= put;
    }

    /**
     * @return the delete flag
     */
    public boolean isDelete()
    {
        return delete;
    }

    /**
     * @param delete the delete flag to set
     */
    public void setDelete( boolean delete )
    {
        this.delete= delete;
    }

    /**
     * @return true when earlyAck flag is set on the resource. 
     */
    public boolean isEarlyAck()
    {
        return this.earlyAck;
    }

    /**
     * @param earlyAck set to true when processing requests takes more than a few seconds
     */
    public void setEarlyAck( boolean earlyAck )
    {
        this.earlyAck= earlyAck;
    }

    /**
     * @param observable the observe flag to set
     */
    public void setObserve( boolean observable )
    {
        this.observe= observable;
    }

    public boolean isObserve()
    {
        return this.observe;
    }

    /**
     * @return the child resources
     */
    public List< ResourceConfig > getResources()
    {
        return resources;
    }

    /**
     * @param resourceConfigs the child resources to set
     */
    public void setResources( List< ResourceConfig > resourceConfigs )
    {
        this.resources= resourceConfigs;
    }
    
    /**
     * @return the child resources or empty collection when not configured
     */
    public Collection< ResourceConfig > getResourceCollection()
    {
        if ( resources != null )
        {
            return resources;
        }
        else
        {
            return new ArrayList< ResourceConfig >();
        }
    }
    /**
     * @param resource the resources to add as child resource
     */
    public void addResource( ResourceConfig resource )
    {
        if ( resources == null )
        {
            resources= new ArrayList< ResourceConfig >();
        }
        resources.add( resource );
    }

    public String getSize()
    {
        // TODO Auto-generated method stub
        return this.size;
    }
    /**
     * @param sizeEstimate the sizeEstimate to set
     */
    public void setSize( String sizeEstimate )
    {
        this.size= sizeEstimate;
    }

    /**
     * @return the contentType
     */
    public String getType()
    {
        return type;
    }

    /**
     * @param contentType the contentType to set
     */
    public void setType( String contentType )
    {
        this.type= contentType;
    }

}
