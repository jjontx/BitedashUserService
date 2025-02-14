package com.bitedash.userinfo.mapper;

import com.bitedash.userinfo.dto.UserDTO;
import com.bitedash.userinfo.entity.User;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-12T13:57:46-0600",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 3.35.0.v20230814-2020, environment: Java 17.0.8.1 (Eclipse Adoptium)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public User mapUserDTOToUser(UserDTO userDTO) {
        if ( userDTO == null ) {
            return null;
        }

        User user = new User();

        user.setUserId( userDTO.getUserId() );
        user.setUserName( userDTO.getUserName() );
        user.setUserPassword( userDTO.getUserPassword() );
        user.setAddress( userDTO.getAddress() );
        user.setCity( userDTO.getCity() );

        return user;
    }

    @Override
    public UserDTO mapUserToUserDTO(User user) {
        if ( user == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setUserId( user.getUserId() );
        userDTO.setUserName( user.getUserName() );
        userDTO.setUserPassword( user.getUserPassword() );
        userDTO.setAddress( user.getAddress() );
        userDTO.setCity( user.getCity() );

        return userDTO;
    }
}
