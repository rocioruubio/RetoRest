package com.ntt.cliente.rest.ServiceRestEveris;

import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;

@RestController
public class RestControllerService {
	Logger logger = LoggerFactory.getLogger(RestControllerService.class);
	
	String status;
	String stOpen = "open";
	String stPause = "pause";
	String stClose = "close";
	
	@GetMapping("/open")
	public ResponseEntity<String> statusOpen(){
		status = stOpen;
		logger.info("Estado del cliente: "+status);
		return ResponseEntity.status(HttpStatus.OK).body(status);
	}
	
	@GetMapping("/pause")
	public ResponseEntity<String> statusPause(){
		status = stPause;
		logger.info("Estado del cliente: "+status);
		return ResponseEntity.status(HttpStatus.OK).body(status);
	}
	
	@GetMapping("/close")
	public ResponseEntity<String> statusClose(){
		status = stClose;
		logger.info("Estado del cliente: "+status);
		return ResponseEntity.status(HttpStatus.OK).body(status);
	}
	
}
