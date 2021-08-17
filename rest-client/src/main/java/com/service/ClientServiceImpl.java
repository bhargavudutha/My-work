package com.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.model.Cart;
import com.model.User;

@Service
public class ClientServiceImpl implements ClientService {

	public Cart search(Integer prodId)
	{
		Cart cart=null;
		if(prodId==10)
		{​​​​​​​
            cart=new Cart();
            cart.setProductId(prodId);
            cart.setProductName("Apple");
            
            RestTemplate restTemplate = new RestTemplate();
            User user = restTemplate.getForObject("http://localhost:8080/springrestminiproject/username/{​​​​​​​userName}​​​​​​​", User.class,"ten");
         System.out.println("user id  :" + user.getUserId());
         System.out.println("user name :" + user.getUserName());
         System.out.println("user password :" + user.getPassword());
         cart.setUser(user);
        }
		return cart;​​​​​​​
		
	}

	​ ​ ​ ​ ​
}