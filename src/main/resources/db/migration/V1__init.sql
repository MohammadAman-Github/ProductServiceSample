CREATE TABLE batch
(
    id   INT NOT NULL,
    name VARCHAR(255) NULL,
    CONSTRAINT pk_batch PRIMARY KEY (id)
);

CREATE TABLE learners
(
    id       INT NOT NULL,
    name     VARCHAR(255) NULL,
    batch_id INT NULL,
    CONSTRAINT pk_learners PRIMARY KEY (id)
);

CREATE TABLE products
(
    id            BIGINT AUTO_INCREMENT NOT NULL,
    name          VARCHAR(255) NULL,
    `description` VARCHAR(255) NULL,
    price DOUBLE NOT NULL,
    category      VARCHAR(255) NULL,
    image         VARCHAR(255) NULL,
    CONSTRAINT pk_products PRIMARY KEY (id)
);

ALTER TABLE learners
    ADD CONSTRAINT FK_LEARNERS_ON_BATCH FOREIGN KEY (batch_id) REFERENCES batch (id);