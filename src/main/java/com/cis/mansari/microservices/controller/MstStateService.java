package com.cis.mansari.microservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cis.mansari.microservices.model.MstState;
import com.cis.mansari.microservices.repository.MstStateRepository;
import com.cis.mansari.response.MstStateResponse;

@RestController
public class MstStateService {

	@Autowired
	MstStateRepository mstStateRepository;

	@RequestMapping(value = "/searchMstStateByStateName", method = RequestMethod.POST)
	private @ResponseBody MstStateResponse searchByStateName(@RequestBody MstState mstState) {
		MstStateResponse mstStateResponse = new MstStateResponse();

		List<MstState> result = mstStateRepository.findByStateName(mstState.getStateName());

		mstStateResponse.setMstStates(result);

		return mstStateResponse;
	}

}
