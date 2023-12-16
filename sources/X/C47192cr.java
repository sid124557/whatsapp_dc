package X;

/* renamed from: X.2cr  reason: invalid class name and case insensitive filesystem */
public class C47192cr {
    public final int A00;
    public final int A01;
    public final long A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public C47192cr(String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, long j) {
        this.A07 = str;
        this.A08 = str2;
        this.A04 = str3;
        this.A05 = str4;
        this.A06 = str5;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = str6;
        this.A02 = j;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("StickerSyncMetadata{fileHash=");
        long j = this.A02;
        A0o.append(j);
        A0o.append(", url=");
        A0o.append(this.A08);
        A0o.append(", encFileHash=");
        A0o.append(this.A04);
        A0o.append(", mediaKey=");
        A0o.append(this.A05);
        A0o.append(", mimeType=");
        A0o.append(this.A06);
        A0o.append(", width=");
        A0o.append(this.A01);
        A0o.append(", height=");
        A0o.append(this.A00);
        A0o.append(", directPath=");
        A0o.append(this.A03);
        A0o.append(", fileSize=");
        A0o.append(j);
        return AnonymousClass000.A0X("}", A0o);
    }
}
