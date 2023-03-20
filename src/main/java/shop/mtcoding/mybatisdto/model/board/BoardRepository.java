package shop.mtcoding.mybatisdto.model.board;

import org.apache.ibatis.annotations.Mapper;
import shop.mtcoding.mybatisdto.dto.BoardDetailOutDto;
import shop.mtcoding.mybatisdto.dto.BoardJoinUserDto;
import shop.mtcoding.mybatisdto.dto.BoardJoinUserDto2;
import shop.mtcoding.mybatisdto.model.user.User;

import java.util.List;

@Mapper
public interface BoardRepository {
    public int insert(Board board);

    public int updateById(Board board);

    public int deleteById(int id);

    public List<Board> findAll();

    public Board findById(int id);

    public BoardDetailOutDto findByIdJoinUser(int id);

    public BoardJoinUserDto findByIdJoinUser2(int id);

    public BoardJoinUserDto2 findByIdJoinUser3(int id);
}