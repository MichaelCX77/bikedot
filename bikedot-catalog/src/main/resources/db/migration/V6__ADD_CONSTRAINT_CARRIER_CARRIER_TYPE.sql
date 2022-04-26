alter table carrier add constraint FKgpe23lgyhw1078im5blowws98 foreign key (type_id) references carrier_type;
alter table carrier_type add constraint FK2vvp89omertc209e1v6uxvbr6 foreign key (accessibility_id) references accessibility_type;
