    package com.example.userpattern.services;

    import com.example.userpattern.dtos.UserDTO;
    import com.example.userpattern.models.User;
    import com.example.userpattern.repositories.UserRepository;
    import org.springframework.beans.BeanUtils;
    import org.springframework.stereotype.Service;

    import java.util.Date;
    import java.util.List;
    import java.util.Optional;
    import java.util.UUID;

    @Service
    public class UserService {



        private final UserRepository userRepository;

        public UserService(UserRepository userRepository) {
            this.userRepository = userRepository;
        }

        public User createUser(UserDTO userDTO) {
            User user = new User();
            BeanUtils.copyProperties(userDTO, user);
            return userRepository.save(user);
        }

        public Optional<User> findUserByID(UUID id) throws Exception {
            Optional<User> user = userRepository.findUserById(id);

            if(user.isEmpty()){
                throw new Exception("User not found");
            }

            return user;
        }

        public List<User> findAll(){
            return userRepository.findAll();
        }

        public void deleteUserByID(UUID id) throws Exception{
            Optional<User> user = this.findUserByID(id);
            user.get().setDeletedAt(new Date());
            user.get().setUpdatedAt(new Date());
        }
    }
