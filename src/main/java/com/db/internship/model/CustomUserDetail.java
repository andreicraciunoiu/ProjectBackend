package com.db.internship.model;
//package com.bfwg.model;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.List;
///**
// *  This class simply a User class with some extra sugar and it is called by UserDetailService.
// *  We are not calling this class anywhere in our application.
// */
//public class CustomUserDetail extends User implements UserDetails {
//
//	private static final long serialVersionUID = 4462508672228179426L;
//
//	@JsonIgnore
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @JsonIgnore
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @JsonIgnore
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return true;
//    }
//
//}