CREATE TABLE Coordinates (
                             id SERIAL PRIMARY KEY,
                             x FLOAT NOT NULL CHECK (x <= 448),
                             y INT NOT NULL CHECK (y > -662)
);

CREATE TABLE Car (
                     id SERIAL PRIMARY KEY,
                     name VARCHAR(255),
                     cool BOOLEAN NOT NULL
);

CREATE TABLE HumanBeing (
                            id SERIAL PRIMARY KEY,
                            name VARCHAR(256) NOT NULL CHECK (name <> ''),
                            coordinates_id INT NOT NULL,
                            creation_date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
                            real_hero BOOLEAN NOT NULL,
                            has_toothpick BOOLEAN NOT NULL,
                            car_id INT,
                            mood VARCHAR(50),
                            impact_speed DOUBLE PRECISION NOT NULL,
                            soundtrack_name VARCHAR(255) NOT NULL,
                            weapon_type VARCHAR(50) NOT NULL,
                            CONSTRAINT fk_coordinates FOREIGN KEY (coordinates_id) REFERENCES Coordinates(id),
                            CONSTRAINT fk_car FOREIGN KEY (car_id) REFERENCES Car(id),
                            CONSTRAINT chk_weapon_type CHECK (weapon_type IN ('RIFLE', 'MACHINE_GUN', 'BAT')),
                            CONSTRAINT chk_mood CHECK (mood IN ('SORROW', 'LONGING', 'GLOOM', 'APATHY'))
);
