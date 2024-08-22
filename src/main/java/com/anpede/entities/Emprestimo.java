package com.anpede.entities;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table (name = "tb_equipamento")
public class Emprestimo implements Serializable {
	private static final long serialVersionUID = 1L;
}
