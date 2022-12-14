package com.topcualperen.business;

import com.topcualperen.dto.UserDto;


public interface UserService {

    UserDto add(UserDto user);

    UserDto findByEmail(int id);

    UserDto deleteUser(int id);


}
