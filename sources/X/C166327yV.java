package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7yV  reason: invalid class name and case insensitive filesystem */
public final class C166327yV implements Parcelable {
    public static final C165587xJ CREATOR = new C165587xJ();
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A0B);
        String str = this.A06;
        if (str != null) {
            parcel.writeString(str);
            parcel.writeString(this.A07);
            parcel.writeString(this.A08);
            String str2 = this.A01;
            if (str2 != null) {
                parcel.writeString(str2);
                String str3 = this.A03;
                if (str3 != null) {
                    parcel.writeString(str3);
                    String str4 = this.A0A;
                    if (str4 != null) {
                        parcel.writeString(str4);
                        parcel.writeString(this.A09);
                        String str5 = this.A05;
                        if (str5 != null) {
                            parcel.writeString(str5);
                            String str6 = this.A04;
                            if (str6 != null) {
                                parcel.writeString(str6);
                                String str7 = this.A02;
                                if (str7 != null) {
                                    parcel.writeString(str7);
                                    return;
                                }
                                throw C18270x1.A0S("crc16");
                            }
                            throw C18270x1.A0S("payeeCity");
                        }
                        throw C18270x1.A0S("payeeName");
                    }
                    throw C18270x1.A0S("txnCurrency");
                }
                throw C18270x1.A0S("payeeCategoryCode");
            }
            throw C18270x1.A0S("countryCode");
        }
        throw C18270x1.A0S("payloadFormatIndicator");
    }

    public int describeContents() {
        return 0;
    }

    public C166327yV(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A0B = parcel.readString();
        String readString = parcel.readString();
        if (readString != null) {
            this.A06 = readString;
            this.A07 = parcel.readString();
            this.A08 = parcel.readString();
            String readString2 = parcel.readString();
            if (readString2 != null) {
                this.A01 = readString2;
                String readString3 = parcel.readString();
                if (readString3 != null) {
                    this.A03 = readString3;
                    String readString4 = parcel.readString();
                    if (readString4 != null) {
                        this.A0A = readString4;
                        this.A09 = parcel.readString();
                        String readString5 = parcel.readString();
                        if (readString5 != null) {
                            this.A05 = readString5;
                            String readString6 = parcel.readString();
                            if (readString6 != null) {
                                this.A04 = readString6;
                                String readString7 = parcel.readString();
                                if (readString7 != null) {
                                    this.A02 = readString7;
                                    return;
                                }
                                throw AnonymousClass001.A0g("Failed to read mandatory filed 'CRC 16' from Parcel");
                            }
                            throw AnonymousClass001.A0g("Failed to read mandatory filed 'Payee City' from Parcel");
                        }
                        throw AnonymousClass001.A0g("Failed to read mandatory filed 'Payee Name' from Parcel");
                    }
                    throw AnonymousClass001.A0g("Failed to read mandatory filed 'Txn Currency' from Parcel");
                }
                throw AnonymousClass001.A0g("Failed to read mandatory filed 'Payee Category Code' from Parcel");
            }
            throw AnonymousClass001.A0g("Failed to read mandatory filed 'Country Code' from Parcel");
        }
        throw AnonymousClass001.A0g("Failed to read mandatory filed 'Payload Format Indicator' from Parcel");
    }

    public C166327yV() {
    }
}
