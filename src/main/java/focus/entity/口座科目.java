/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package focus.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author masaru
 */
@Entity
@Table(name = "\u53e3\u5ea7\u79d1\u76ee")
@XmlRootElement
@NamedQueries({
	@NamedQuery(name = "\u53e3\u5ea7\u79d1\u76ee.findAll", query = "SELECT \u53e3 FROM \u53e3\u5ea7\u79d1\u76ee \u53e3"),
	@NamedQuery(name = "\u53e3\u5ea7\u79d1\u76ee.findBy\u66f4\u65b0\u30b8\u30e7\u30d6id", query = "SELECT \u53e3 FROM \u53e3\u5ea7\u79d1\u76ee \u53e3 WHERE \u53e3.\u66f4\u65b0\u30b8\u30e7\u30d6id = :\u66f4\u65b0\u30b8\u30e7\u30d6id"),
	@NamedQuery(name = "\u53e3\u5ea7\u79d1\u76ee.findBy\u66f4\u65b0\u8005\u540d", query = "SELECT \u53e3 FROM \u53e3\u5ea7\u79d1\u76ee \u53e3 WHERE \u53e3.\u66f4\u65b0\u8005\u540d = :\u66f4\u65b0\u8005\u540d"),
	@NamedQuery(name = "\u53e3\u5ea7\u79d1\u76ee.findBy\u66f4\u65b0\u65e5\u6642", query = "SELECT \u53e3 FROM \u53e3\u5ea7\u79d1\u76ee \u53e3 WHERE \u53e3.\u66f4\u65b0\u65e5\u6642 = :\u66f4\u65b0\u65e5\u6642"),
	@NamedQuery(name = "\u53e3\u5ea7\u79d1\u76ee.findBy\u30c7\u30fc\u30bf\u57fa\u6e96\u65e5", query = "SELECT \u53e3 FROM \u53e3\u5ea7\u79d1\u76ee \u53e3 WHERE \u53e3.\u30c7\u30fc\u30bf\u57fa\u6e96\u65e5 = :\u30c7\u30fc\u30bf\u57fa\u6e96\u65e5"),
	@NamedQuery(name = "\u53e3\u5ea7\u79d1\u76ee.findBy\u30b3\u30fc\u30c9", query = "SELECT \u53e3 FROM \u53e3\u5ea7\u79d1\u76ee \u53e3 WHERE \u53e3.\u30b3\u30fc\u30c9 = :\u30b3\u30fc\u30c9"),
	@NamedQuery(name = "\u53e3\u5ea7\u79d1\u76ee.findBy\u540d\u79f0", query = "SELECT \u53e3 FROM \u53e3\u5ea7\u79d1\u76ee \u53e3 WHERE \u53e3.\u540d\u79f0 = :\u540d\u79f0"),
	@NamedQuery(name = "\u53e3\u5ea7\u79d1\u76ee.findBy\u6d41\u52d5\u6027\u30d5\u30e9\u30b0", query = "SELECT \u53e3 FROM \u53e3\u5ea7\u79d1\u76ee \u53e3 WHERE \u53e3.\u6d41\u52d5\u6027\u30d5\u30e9\u30b0 = :\u6d41\u52d5\u6027\u30d5\u30e9\u30b0")})
public class 口座科目 implements Serializable {
	private static final long serialVersionUID = 1L;
	@Size(max = 30)
        @Column(name = "\u66f4\u65b0\u30b8\u30e7\u30d6ID")
	private String 更新ジョブid;
	@Size(max = 30)
        @Column(name = "\u66f4\u65b0\u8005\u540d")
	private String 更新者名;
	@Size(max = 17)
        @Column(name = "\u66f4\u65b0\u65e5\u6642")
	private String 更新日時;
	@Basic(optional = false)
        @NotNull
        @Size(min = 1, max = 8)
        @Column(name = "\u30c7\u30fc\u30bf\u57fa\u6e96\u65e5")
	private String データ基準日;
	@Id
        @Basic(optional = false)
        @NotNull
        @Column(name = "\u30b3\u30fc\u30c9")
	private Integer コード;
	@Basic(optional = false)
        @NotNull
        @Size(min = 1, max = 24)
        @Column(name = "\u540d\u79f0")
	private String 名称;
	@Basic(optional = false)
        @NotNull
        @Column(name = "\u6d41\u52d5\u6027\u30d5\u30e9\u30b0")
	private int 流動性フラグ;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "\u53e3\u5ea7\u79d1\u76ee\u30b3\u30fc\u30c9")
	private Collection<口座> 口座Collection;

	public 口座科目() {
	}

	public 口座科目(Integer コード) {
		this.コード = コード;
	}

	public 口座科目(Integer コード, String データ基準日, String 名称, int 流動性フラグ) {
		this.コード = コード;
		this.データ基準日 = データ基準日;
		this.名称 = 名称;
		this.流動性フラグ = 流動性フラグ;
	}

	public String get更新ジョブid() {
		return 更新ジョブid;
	}

	public void set更新ジョブid(String 更新ジョブid) {
		this.更新ジョブid = 更新ジョブid;
	}

	public String get更新者名() {
		return 更新者名;
	}

	public void set更新者名(String 更新者名) {
		this.更新者名 = 更新者名;
	}

	public String get更新日時() {
		return 更新日時;
	}

	public void set更新日時(String 更新日時) {
		this.更新日時 = 更新日時;
	}

	public String getデータ基準日() {
		return データ基準日;
	}

	public void setデータ基準日(String データ基準日) {
		this.データ基準日 = データ基準日;
	}

	public Integer getコード() {
		return コード;
	}

	public void setコード(Integer コード) {
		this.コード = コード;
	}

	public String get名称() {
		return 名称;
	}

	public void set名称(String 名称) {
		this.名称 = 名称;
	}

	public int get流動性フラグ() {
		return 流動性フラグ;
	}

	public void set流動性フラグ(int 流動性フラグ) {
		this.流動性フラグ = 流動性フラグ;
	}

	@XmlTransient
	public Collection<口座> get口座Collection() {
		return 口座Collection;
	}

	public void set口座Collection(Collection<口座> 口座Collection) {
		this.口座Collection = 口座Collection;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (コード != null ? コード.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof 口座科目)) {
			return false;
		}
		口座科目 other = (口座科目) object;
		if ((this.コード == null && other.コード != null) || (this.コード != null && !this.コード.equals(other.コード))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "focus.entity.\u53e3\u5ea7\u79d1\u76ee[ \u30b3\u30fc\u30c9=" + コード + " ]";
	}
	
}
