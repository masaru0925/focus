/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package focus.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author masaru
 */
@Entity
@Table(name = "\u53e3\u5ea7")
@XmlRootElement
@NamedQueries({
	@NamedQuery(name = "\u53e3\u5ea7.findAll", query = "SELECT \u53e3 FROM \u53e3\u5ea7 \u53e3"),
	@NamedQuery(name = "\u53e3\u5ea7.findBy\u66f4\u65b0\u30b8\u30e7\u30d6id", query = "SELECT \u53e3 FROM \u53e3\u5ea7 \u53e3 WHERE \u53e3.\u66f4\u65b0\u30b8\u30e7\u30d6id = :\u66f4\u65b0\u30b8\u30e7\u30d6id"),
	@NamedQuery(name = "\u53e3\u5ea7.findBy\u66f4\u65b0\u8005\u540d", query = "SELECT \u53e3 FROM \u53e3\u5ea7 \u53e3 WHERE \u53e3.\u66f4\u65b0\u8005\u540d = :\u66f4\u65b0\u8005\u540d"),
	@NamedQuery(name = "\u53e3\u5ea7.findBy\u66f4\u65b0\u65e5\u6642", query = "SELECT \u53e3 FROM \u53e3\u5ea7 \u53e3 WHERE \u53e3.\u66f4\u65b0\u65e5\u6642 = :\u66f4\u65b0\u65e5\u6642"),
	@NamedQuery(name = "\u53e3\u5ea7.findBy\u30c7\u30fc\u30bf\u57fa\u6e96\u65e5", query = "SELECT \u53e3 FROM \u53e3\u5ea7 \u53e3 WHERE \u53e3.\u30c7\u30fc\u30bf\u57fa\u6e96\u65e5 = :\u30c7\u30fc\u30bf\u57fa\u6e96\u65e5"),
	@NamedQuery(name = "\u53e3\u5ea7.findById", query = "SELECT \u53e3 FROM \u53e3\u5ea7 \u53e3 WHERE \u53e3.id = :id"),
	@NamedQuery(name = "\u53e3\u5ea7.findBy\u56fd\u30b3\u30fc\u30c9", query = "SELECT \u53e3 FROM \u53e3\u5ea7 \u53e3 WHERE \u53e3.\u56fd\u30b3\u30fc\u30c9 = :\u56fd\u30b3\u30fc\u30c9"),
	@NamedQuery(name = "\u53e3\u5ea7.findBy\u91d1\u878d\u6a5f\u95a2\u30b3\u30fc\u30c9", query = "SELECT \u53e3 FROM \u53e3\u5ea7 \u53e3 WHERE \u53e3.\u91d1\u878d\u6a5f\u95a2\u30b3\u30fc\u30c9 = :\u91d1\u878d\u6a5f\u95a2\u30b3\u30fc\u30c9"),
	@NamedQuery(name = "\u53e3\u5ea7.findBy\u5e97\u756a", query = "SELECT \u53e3 FROM \u53e3\u5ea7 \u53e3 WHERE \u53e3.\u5e97\u756a = :\u5e97\u756a"),
	@NamedQuery(name = "\u53e3\u5ea7.findBy\u53e3\u5ea7\u756a\u53f7", query = "SELECT \u53e3 FROM \u53e3\u5ea7 \u53e3 WHERE \u53e3.\u53e3\u5ea7\u756a\u53f7 = :\u53e3\u5ea7\u756a\u53f7"),
	@NamedQuery(name = "\u53e3\u5ea7.findBy\u9867\u5ba2\u5e97\u756a", query = "SELECT \u53e3 FROM \u53e3\u5ea7 \u53e3 WHERE \u53e3.\u9867\u5ba2\u5e97\u756a = :\u9867\u5ba2\u5e97\u756a"),
	@NamedQuery(name = "\u53e3\u5ea7.findBy\u9867\u5ba2\u756a\u53f7", query = "SELECT \u53e3 FROM \u53e3\u5ea7 \u53e3 WHERE \u53e3.\u9867\u5ba2\u756a\u53f7 = :\u9867\u5ba2\u756a\u53f7"),
	@NamedQuery(name = "\u53e3\u5ea7.findBy\u5f53\u884c\u30d5\u30e9\u30b0", query = "SELECT \u53e3 FROM \u53e3\u5ea7 \u53e3 WHERE \u53e3.\u5f53\u884c\u30d5\u30e9\u30b0 = :\u5f53\u884c\u30d5\u30e9\u30b0"),
	@NamedQuery(name = "\u53e3\u5ea7.findBy\u89e3\u7d04\u30d5\u30e9\u30b0", query = "SELECT \u53e3 FROM \u53e3\u5ea7 \u53e3 WHERE \u53e3.\u89e3\u7d04\u30d5\u30e9\u30b0 = :\u89e3\u7d04\u30d5\u30e9\u30b0"),
	@NamedQuery(name = "\u53e3\u5ea7.findBy\u89e3\u7d04\u65e5", query = "SELECT \u53e3 FROM \u53e3\u5ea7 \u53e3 WHERE \u53e3.\u89e3\u7d04\u65e5 = :\u89e3\u7d04\u65e5")})
public class 口座 implements Serializable {
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
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Basic(optional = false)
        @Column(name = "ID")
	private Integer id;
	@Basic(optional = false)
        @NotNull
        @Size(min = 1, max = 5)
        @Column(name = "\u56fd\u30b3\u30fc\u30c9")
	private String 国コード;
	@Basic(optional = false)
        @NotNull
        @Column(name = "\u91d1\u878d\u6a5f\u95a2\u30b3\u30fc\u30c9")
	private int 金融機関コード;
	@Basic(optional = false)
        @NotNull
        @Column(name = "\u5e97\u756a")
	private int 店番;
	@Basic(optional = false)
        @NotNull
        @Column(name = "\u53e3\u5ea7\u756a\u53f7")
	private int 口座番号;
	@Column(name = "\u9867\u5ba2\u5e97\u756a")
	private Integer 顧客店番;
	@Column(name = "\u9867\u5ba2\u756a\u53f7")
	private Integer 顧客番号;
	@Basic(optional = false)
        @NotNull
        @Column(name = "\u5f53\u884c\u30d5\u30e9\u30b0")
	private int 当行フラグ;
	@Basic(optional = false)
        @NotNull
        @Column(name = "\u89e3\u7d04\u30d5\u30e9\u30b0")
	private int 解約フラグ;
	@Column(name = "\u89e3\u7d04\u65e5")
	private Integer 解約日;
	@JoinColumn(name = "\u53e3\u5ea7\u79d1\u76ee\u30b3\u30fc\u30c9", referencedColumnName = "\u30b3\u30fc\u30c9")
        @ManyToOne(optional = false)
	private 口座科目 口座科目コード;

	public 口座() {
	}

	public 口座(Integer id) {
		this.id = id;
	}

	public 口座(Integer id, String データ基準日, String 国コード, int 金融機関コード, int 店番, int 口座番号, int 当行フラグ, int 解約フラグ) {
		this.id = id;
		this.データ基準日 = データ基準日;
		this.国コード = 国コード;
		this.金融機関コード = 金融機関コード;
		this.店番 = 店番;
		this.口座番号 = 口座番号;
		this.当行フラグ = 当行フラグ;
		this.解約フラグ = 解約フラグ;
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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String get国コード() {
		return 国コード;
	}

	public void set国コード(String 国コード) {
		this.国コード = 国コード;
	}

	public int get金融機関コード() {
		return 金融機関コード;
	}

	public void set金融機関コード(int 金融機関コード) {
		this.金融機関コード = 金融機関コード;
	}

	public int get店番() {
		return 店番;
	}

	public void set店番(int 店番) {
		this.店番 = 店番;
	}

	public int get口座番号() {
		return 口座番号;
	}

	public void set口座番号(int 口座番号) {
		this.口座番号 = 口座番号;
	}

	public Integer get顧客店番() {
		return 顧客店番;
	}

	public void set顧客店番(Integer 顧客店番) {
		this.顧客店番 = 顧客店番;
	}

	public Integer get顧客番号() {
		return 顧客番号;
	}

	public void set顧客番号(Integer 顧客番号) {
		this.顧客番号 = 顧客番号;
	}

	public int get当行フラグ() {
		return 当行フラグ;
	}

	public void set当行フラグ(int 当行フラグ) {
		this.当行フラグ = 当行フラグ;
	}

	public int get解約フラグ() {
		return 解約フラグ;
	}

	public void set解約フラグ(int 解約フラグ) {
		this.解約フラグ = 解約フラグ;
	}

	public Integer get解約日() {
		return 解約日;
	}

	public void set解約日(Integer 解約日) {
		this.解約日 = 解約日;
	}

	public 口座科目 get口座科目コード() {
		return 口座科目コード;
	}

	public void set口座科目コード(口座科目 口座科目コード) {
		this.口座科目コード = 口座科目コード;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (id != null ? id.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof 口座)) {
			return false;
		}
		口座 other = (口座) object;
		if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "focus.entity.\u53e3\u5ea7[ id=" + id + " ]";
	}
	
}
