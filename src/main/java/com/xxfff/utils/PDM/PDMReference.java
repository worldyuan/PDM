package com.xxfff.utils.PDM;

import java.util.ArrayList;

public class PDMReference {
	private String id;
	private String name;
	private String code;
	/**
	 * 1..1<br/>
	 * 1..*<br/>
	 * 0..1<br/>
	 * 0..*<br/>
	 */
	private String cardinality;
	private String comment;
	private String constraintName;
	private PDMTable parentTable;
	// private String parentKey;
	private PDMTable childTable;
	private int updateConstraint = 1;
	private int deleteConstraint = 1;
	private String implementationType;
	private ArrayList<PDMReferenceJoin> joins = new ArrayList<PDMReferenceJoin>();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getConstraintName() {
		return constraintName;
	}

	public void setConstraintName(String constraintName) {
		this.constraintName = constraintName;
	}

	public PDMTable getParentTable() {
		return parentTable;
	}

	public void setParentTable(PDMTable parentTable) {
		this.parentTable = parentTable;
	}

	public PDMTable getChildTable() {
		return childTable;
	}

	public void setChildTable(PDMTable childTable) {
		this.childTable = childTable;
	}

	public int getUpdateConstraint() {
		return updateConstraint;
	}

	public void setUpdateConstraint(int updateConstraint) {
		this.updateConstraint = updateConstraint;
	}

	public int getDeleteConstraint() {
		return deleteConstraint;
	}

	public void setDeleteConstraint(int deleteConstraint) {
		this.deleteConstraint = deleteConstraint;
	}

	public String getImplementationType() {
		return implementationType;
	}

	public void setImplementationType(String implementationType) {
		this.implementationType = implementationType;
	}

	public ArrayList<PDMReferenceJoin> getJoins() {
		return joins;
	}

	public void setJoins(ArrayList<PDMReferenceJoin> joins) {
		this.joins = joins;
	}

	public void addReferenceJoin(PDMReferenceJoin pdmReferenceJoin) {
		joins.add(pdmReferenceJoin);
	}

	public String getCardinality() {
		return cardinality;
	}

	public void setCardinality(String cardinality) {
		this.cardinality = cardinality;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
}