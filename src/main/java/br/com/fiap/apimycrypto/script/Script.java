package br.com.fiap.apimycrypto.script;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_mycrypto_scripts")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Script {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    int clicks;
    int screenTime;
}
