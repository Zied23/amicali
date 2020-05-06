package com.pfa.amicali.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pfa.amicali.Entity.Provider;
import com.pfa.amicali.Service.Provider.ProviderServiceImpl;

@RestController
@RequestMapping(path = "/Provider")
@CrossOrigin(origins = "http://localhost:8089")
public class ProviderController {
	@Autowired 
	private ProviderServiceImpl providerService;
	
	
	@GetMapping(value = "/show")
	public List<Provider>getProviders(){
		List<Provider> providers =providerService.read();
		return providers;
		
	}
	
	
	
	@GetMapping(value = "/show/{id}")
	 public Optional<Provider>getProviders(@PathVariable Long id){
		Optional<Provider> providers = providerService.read(id);
	  return providers;
	}
	
	
	@PostMapping(path= "/new/provider", consumes = "application/json", produces = "application/json")
    public void creatProvider(@RequestBody Provider provider){
      providerService.create(provider);
	return ;
	}
	
	
	@RequestMapping(path= "/update/provider/{id}", consumes = "application/json", produces = "application/json" , method = RequestMethod.PUT)
    public void updateProvider(@RequestBody Provider provider,@PathVariable Long id)/*,@PathVariable Long id_provider)*/{
      
	providerService.update(provider, id);
    }
	
	@RequestMapping(value = "/remove/{id}", method = RequestMethod.DELETE)
	 public void deleteProvider(@PathVariable("id") long id) {
		//Product product = productService.getOne(id);
		providerService.delete(id);
		return ;
	}
	
	
}
