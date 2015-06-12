//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.12 at 06:09:48 PM EDT 
//


package com.aquarellian.genar.filter.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for IssueFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IssueFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;sequence>
 *           &lt;element name="statuses" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element name="severities" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element name="components" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element name="rules" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;element name="anew" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="createdfrom" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="createdto" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IssueFilter", propOrder = {
    "statuses",
    "severities",
    "components",
    "rules",
    "anew",
    "createdfrom",
    "createdto"
})
public class IssueFilter {

    protected List<String> statuses;
    protected List<String> severities;
    protected List<String> components;
    protected List<String> rules;
    @XmlElement(defaultValue = "false")
    protected Boolean anew;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar createdfrom;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar createdto;

    /**
     * Gets the value of the statuses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statuses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatuses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStatuses() {
        if (statuses == null) {
            statuses = new ArrayList<String>();
        }
        return this.statuses;
    }

    public boolean isSetStatuses() {
        return ((this.statuses!= null)&&(!this.statuses.isEmpty()));
    }

    public void unsetStatuses() {
        this.statuses = null;
    }

    /**
     * Gets the value of the severities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the severities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeverities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSeverities() {
        if (severities == null) {
            severities = new ArrayList<String>();
        }
        return this.severities;
    }

    public boolean isSetSeverities() {
        return ((this.severities!= null)&&(!this.severities.isEmpty()));
    }

    public void unsetSeverities() {
        this.severities = null;
    }

    /**
     * Gets the value of the components property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the components property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getComponents() {
        if (components == null) {
            components = new ArrayList<String>();
        }
        return this.components;
    }

    public boolean isSetComponents() {
        return ((this.components!= null)&&(!this.components.isEmpty()));
    }

    public void unsetComponents() {
        this.components = null;
    }

    /**
     * Gets the value of the rules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRules() {
        if (rules == null) {
            rules = new ArrayList<String>();
        }
        return this.rules;
    }

    public boolean isSetRules() {
        return ((this.rules!= null)&&(!this.rules.isEmpty()));
    }

    public void unsetRules() {
        this.rules = null;
    }

    /**
     * Gets the value of the anew property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAnew() {
        return anew;
    }

    /**
     * Sets the value of the anew property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAnew(Boolean value) {
        this.anew = value;
    }

    public boolean isSetAnew() {
        return (this.anew!= null);
    }

    /**
     * Gets the value of the createdfrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedfrom() {
        return createdfrom;
    }

    /**
     * Sets the value of the createdfrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedfrom(XMLGregorianCalendar value) {
        this.createdfrom = value;
    }

    public boolean isSetCreatedfrom() {
        return (this.createdfrom!= null);
    }

    /**
     * Gets the value of the createdto property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedto() {
        return createdto;
    }

    /**
     * Sets the value of the createdto property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedto(XMLGregorianCalendar value) {
        this.createdto = value;
    }

    public boolean isSetCreatedto() {
        return (this.createdto!= null);
    }

}
