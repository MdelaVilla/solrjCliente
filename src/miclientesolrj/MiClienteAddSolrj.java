/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miclientesolrj;

import java.io.IOException;

import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrClient;


import org.apache.solr.common.SolrInputDocument;

/**
 *
 * @author manueldelavilla
 */
public class MiClienteAddSolrj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException,
			SolrServerException {

                HttpSolrClient solr = new HttpSolrClient.Builder("http://localhost:8983/solr/gettingstarted").build();
		
		//Create solr document
		SolrInputDocument doc = new SolrInputDocument();
		doc.addField("name", "Manuel de la Villa");
		doc.addField("age", 46);
                doc.addField("email", "manuel.villa@dti.uhu.es");
		solr.add(doc);
		solr.commit();
	}
    
}
