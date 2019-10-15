package com.admin.springbootadmin.ifs;

import com.admin.springbootadmin.model.network.Header;

public interface CRUDInterface<Req, Res> {

    Header<Res> create(Header<Req> request);

    Header<Res> read(Long id);

    Header<Res> update(Header<Req> request);

    Header delete(Long id);
}
