--
-- EXTENDCOMMENT-2 : Add the possibility to notify a mailing list when a comment is added.
--
ALTER TABLE extend_comment_config ADD COLUMN id_mailing_list INT DEFAULT 0 NOT NULL;
ALTER TABLE extend_comment_config ADD COLUMN authorize_sub_comments SMALLINT default 0 NOT NULL;
ALTER TABLE extend_comment_config ADD COLUMN use_bbcode SMALLINT default 1 NOT NULL;

ALTER TABLE extend_comment ADD COLUMN date_last_modif TIMESTAMP;
ALTER TABLE extend_comment ADD COLUMN id_parent_comment INT DEFAULT 0 NOT NULL;
