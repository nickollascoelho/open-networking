package org.gujavasc.opennetworking.domain.service;

import javax.ejb.Stateless;
import javax.inject.Inject;

import org.gujavasc.opennetworking.domain.model.user.aggregator.User;
import org.gujavasc.opennetworking.domain.repository.UserRepository;

@Stateless
public class UserServiceImpl implements UserService {

	@Inject
	private UserRepository userRepository;
	
	@Override
	public User getByIdSocialProfile(String idUserSocialProfile) {
		return null;
	}

}