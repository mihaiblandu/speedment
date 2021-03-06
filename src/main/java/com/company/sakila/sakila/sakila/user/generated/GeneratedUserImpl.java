package com.company.sakila.sakila.sakila.user.generated;

import com.company.sakila.sakila.sakila.user.User;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.core.util.OptionalUtil;

import java.util.Objects;
import java.util.Optional;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.company.sakila.sakila.sakila.user.User}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedUserImpl implements User {
    
    private long id;
    private String name;
    private String surName;
    
    protected GeneratedUserImpl() {}
    
    @Override
    public long getId() {
        return id;
    }
    
    @Override
    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }
    
    @Override
    public Optional<String> getSurName() {
        return Optional.ofNullable(surName);
    }
    
    @Override
    public User setId(long id) {
        this.id = id;
        return this;
    }
    
    @Override
    public User setName(String name) {
        this.name = name;
        return this;
    }
    
    @Override
    public User setSurName(String surName) {
        this.surName = surName;
        return this;
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = "      + Objects.toString(getId()));
        sj.add("name = "    + Objects.toString(OptionalUtil.unwrap(getName())));
        sj.add("surName = " + Objects.toString(OptionalUtil.unwrap(getSurName())));
        return "UserImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof User)) { return false; }
        final User thatUser = (User)that;
        if (this.getId() != thatUser.getId()) { return false; }
        if (!Objects.equals(this.getName(), thatUser.getName())) { return false; }
        if (!Objects.equals(this.getSurName(), thatUser.getSurName())) { return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Long.hashCode(getId());
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getName()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getSurName()));
        return hash;
    }
}