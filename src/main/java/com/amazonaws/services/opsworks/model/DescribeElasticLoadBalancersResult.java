/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.opsworks.model;
import java.io.Serializable;

/**
 * <p>
 * Contains the response to a <code>DescribeElasticLoadBalancers</code> request.
 * </p>
 */
public class DescribeElasticLoadBalancersResult  implements Serializable  {

    /**
     * A list of <code>ElasticLoadBalancer</code> objects that describe the
     * specified Elastic Load Balancing instances.
     */
    private java.util.List<ElasticLoadBalancer> elasticLoadBalancers;

    /**
     * A list of <code>ElasticLoadBalancer</code> objects that describe the
     * specified Elastic Load Balancing instances.
     *
     * @return A list of <code>ElasticLoadBalancer</code> objects that describe the
     *         specified Elastic Load Balancing instances.
     */
    public java.util.List<ElasticLoadBalancer> getElasticLoadBalancers() {
        
        if (elasticLoadBalancers == null) {
            elasticLoadBalancers = new java.util.ArrayList<ElasticLoadBalancer>();
        }
        return elasticLoadBalancers;
    }
    
    /**
     * A list of <code>ElasticLoadBalancer</code> objects that describe the
     * specified Elastic Load Balancing instances.
     *
     * @param elasticLoadBalancers A list of <code>ElasticLoadBalancer</code> objects that describe the
     *         specified Elastic Load Balancing instances.
     */
    public void setElasticLoadBalancers(java.util.Collection<ElasticLoadBalancer> elasticLoadBalancers) {
        if (elasticLoadBalancers == null) {
            this.elasticLoadBalancers = null;
            return;
        }

        java.util.List<ElasticLoadBalancer> elasticLoadBalancersCopy = new java.util.ArrayList<ElasticLoadBalancer>(elasticLoadBalancers.size());
        elasticLoadBalancersCopy.addAll(elasticLoadBalancers);
        this.elasticLoadBalancers = elasticLoadBalancersCopy;
    }
    
    /**
     * A list of <code>ElasticLoadBalancer</code> objects that describe the
     * specified Elastic Load Balancing instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param elasticLoadBalancers A list of <code>ElasticLoadBalancer</code> objects that describe the
     *         specified Elastic Load Balancing instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeElasticLoadBalancersResult withElasticLoadBalancers(ElasticLoadBalancer... elasticLoadBalancers) {
        if (getElasticLoadBalancers() == null) setElasticLoadBalancers(new java.util.ArrayList<ElasticLoadBalancer>(elasticLoadBalancers.length));
        for (ElasticLoadBalancer value : elasticLoadBalancers) {
            getElasticLoadBalancers().add(value);
        }
        return this;
    }
    
    /**
     * A list of <code>ElasticLoadBalancer</code> objects that describe the
     * specified Elastic Load Balancing instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param elasticLoadBalancers A list of <code>ElasticLoadBalancer</code> objects that describe the
     *         specified Elastic Load Balancing instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeElasticLoadBalancersResult withElasticLoadBalancers(java.util.Collection<ElasticLoadBalancer> elasticLoadBalancers) {
        if (elasticLoadBalancers == null) {
            this.elasticLoadBalancers = null;
        } else {
            java.util.List<ElasticLoadBalancer> elasticLoadBalancersCopy = new java.util.ArrayList<ElasticLoadBalancer>(elasticLoadBalancers.size());
            elasticLoadBalancersCopy.addAll(elasticLoadBalancers);
            this.elasticLoadBalancers = elasticLoadBalancersCopy;
        }

        return this;
    }
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");    	
        if (getElasticLoadBalancers() != null) sb.append("ElasticLoadBalancers: " + getElasticLoadBalancers() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getElasticLoadBalancers() == null) ? 0 : getElasticLoadBalancers().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeElasticLoadBalancersResult == false) return false;
        DescribeElasticLoadBalancersResult other = (DescribeElasticLoadBalancersResult)obj;
        
        if (other.getElasticLoadBalancers() == null ^ this.getElasticLoadBalancers() == null) return false;
        if (other.getElasticLoadBalancers() != null && other.getElasticLoadBalancers().equals(this.getElasticLoadBalancers()) == false) return false; 
        return true;
    }
    
}
    