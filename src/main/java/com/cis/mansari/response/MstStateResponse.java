package com.cis.mansari.response;

import java.util.List;

import com.cis.mansari.microservices.model.MstState;


public class MstStateResponse {

	private MstState mstState;
	private List<MstState> mstStates;

	public MstState getMstState() {
		return mstState;
	}

	public void setMstState(MstState mstState) {
		this.mstState = mstState;
	}

	public List<MstState> getMstStates() {
		return mstStates;
	}

	public void setMstStates(List<MstState> mstStates) {
		this.mstStates = mstStates;
	}

}
