package com.scc.enci.template;

import java.util.List;

import io.swagger.annotations.ApiModelProperty;

public class ResponseObjectList<T> {

	@ApiModelProperty(notes = "The Total of dogs", position = 1, required = true)
	private int itemsCount;
	
	@ApiModelProperty(notes = "The list of dogs", position = 2, required = true, allowEmptyValue=true)
	private List<ResponseObject> items;
	
	public ResponseObjectList(int itemsCount, List<ResponseObject> items) {
		super();
		this.itemsCount = itemsCount;
		this.items = items;
	}
	
	public int getItemsCount() { return itemsCount; }
	public void setItemsCount(int itemsCount) { this.itemsCount = itemsCount; }

	public List<ResponseObject> getItems() { return items; }
	public void setItems(List<ResponseObject> items) { this.items = items; }

	public int size() { return this.items.size(); }
	
}