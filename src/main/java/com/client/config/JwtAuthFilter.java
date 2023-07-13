//package com.client.config;
//
//import org.springframework.http.HttpHeaders;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
//import org.springframework.stereotype.Component;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//@Component
//public class JwtAuthFilter extends OncePerRequestFilter {
//
//    private final UserDetailsService userDetailsService;
//
//    public JwtAuthFilter(UserDetailsService userDetailsService) {
//        this.userDetailsService = userDetailsService;
//    }
//
//    @Override
//    protected void doFilterInternal(HttpServletRequest request,
//                                    HttpServletResponse response,
//                                    FilterChain filterChain) throws ServletException, IOException {
//        final String authHeader = request.getHeader(HttpHeaders.AUTHORIZATION);
//        final String userEmail;
//        final String jwtToken;
//
//        if (authHeader == null || !authHeader.startsWith("Bearer")){
//            filterChain.doFilter(request, response);
//            return;
//        }
//
//        jwtToken = authHeader.substring(7);
//        userEmail = "something";
//
//        if (userEmail != null && SecurityContextHolder.getContext().getAuthentication() == null){
//            UserDetails userDetails = userDetailsService.loadUserByUsername(userEmail);
//            final boolean isTokenValid;
//            if (isTokenValid){
//                UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(userDetails,
//                        null, userDetails.getAuthorities());
//                authToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
//                SecurityContextHolder.getContext().setAuthentication(authToken);
//            }
//        }
//        filterChain.doFilter(request, response);
//    }
//}
