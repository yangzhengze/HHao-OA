package com.yj.oa.project.service.note;

import com.yj.oa.project.po.Note;

import java.util.List;

/**
 * @author 剑豪
 */
public interface INoteService{
    int deleteByPrimaryKeys(Integer[] id);

    int insertSelective(Note record);

    Note selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Note record);

    List<Note> selectNoteList(Note note);
}
