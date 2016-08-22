/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.datos.hash;

import proyecto.datos.pkg2.Nodo;

/**
 *
 * @author tonyx
 */
public class ValuesHash {
    private String node;
	
	private ValuesHash m_sig;

	public String getNode() {
		return node;
	}

	public void setNode(String node) {
		this.node = node;
	}

	public ValuesHash getM_sig() {
		return m_sig;
	}

	public void setM_sig(ValuesHash m_sig) {
		this.m_sig = m_sig;
	}
	public ValuesHash(){
		
	}

	public ValuesHash(String node) {
		
		this.node = node;
		this.m_sig = null;
	}
}
