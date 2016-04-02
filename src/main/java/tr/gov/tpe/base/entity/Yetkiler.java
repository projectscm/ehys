package tr.gov.tpe.base.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by bsezgin on 25.03.2016.
 */
@Entity
public class Yetkiler {
  private int id;
  private String yetkitanimi;
  private int aktif;

  @Id
  @Column(name = "id", nullable = false, insertable = true, updatable = true)
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  @Basic
  @Column(name = "yetkitanimi", nullable = false, insertable = true, updatable = true, length = 50)
  public String getYetkitanimi() {
    return yetkitanimi;
  }

  public void setYetkitanimi(String yetkitanimi) {
    this.yetkitanimi = yetkitanimi;
  }

  @Basic
  @Column(name = "aktif", nullable = false, insertable = true, updatable = true)
  public int getAktif() {
    return aktif;
  }

  public void setAktif(int aktif) {
    this.aktif = aktif;
  }
}
