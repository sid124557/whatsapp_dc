package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.cameracore.ardelivery.model.ARAssetType;
import com.facebook.cameracore.ardelivery.model.ARCapabilityMinVersionModeling;
import com.facebook.cameracore.ardelivery.model.AREffectAsyncAsset;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset$CompressionMethod;
import com.facebook.cameracore.ardelivery.model.EffectAssetType;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* renamed from: X.9Xk  reason: invalid class name and case insensitive filesystem */
public class C195349Xk implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C204589pb(2);
    public final long A00;
    public final long A01;
    public final AnonymousClass9WL A02;
    public final AnonymousClass9JU A03;
    public final C195359Xl A04;
    public final C129586aY A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final List A0B;
    public final boolean A0C;
    public final boolean A0D;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        if (r0 != null) goto L_0x0014;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r6 = 1
            if (r7 == r8) goto L_0x00b2
            boolean r1 = r8 instanceof X.C195349Xk
            r0 = 0
            if (r1 != 0) goto L_0x0009
            return r0
        L_0x0009:
            X.9Xk r8 = (X.C195349Xk) r8
            X.9Xl r1 = r7.A04
            X.9Xl r0 = r8.A04
            if (r1 != 0) goto L_0x00a9
            r5 = 1
            if (r0 == 0) goto L_0x0015
        L_0x0014:
            r5 = 0
        L_0x0015:
            X.9WL r0 = r7.A02
            java.lang.String r1 = r0.A0A
            X.9WL r0 = r8.A02
            java.lang.String r0 = r0.A0A
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00b1
            java.lang.String r1 = r7.A08
            java.lang.String r0 = r8.A08
            if (r1 != 0) goto L_0x00a2
            if (r0 != 0) goto L_0x00b1
        L_0x002b:
            java.lang.String r1 = r7.A0A
            java.lang.String r0 = r8.A0A
            if (r1 != 0) goto L_0x009b
            if (r0 != 0) goto L_0x00b1
        L_0x0033:
            java.lang.String r1 = r7.A07
            java.lang.String r0 = r8.A07
            if (r1 != 0) goto L_0x0094
            if (r0 != 0) goto L_0x00b1
        L_0x003b:
            boolean r1 = r7.A0C
            boolean r0 = r8.A0C
            if (r1 != r0) goto L_0x00b1
            java.lang.String r1 = r7.A06
            java.lang.String r0 = r8.A06
            if (r1 != 0) goto L_0x008d
            if (r0 != 0) goto L_0x00b1
        L_0x0049:
            X.9JU r1 = r7.A03
            X.9JU r0 = r8.A03
            if (r1 != r0) goto L_0x00b1
            long r3 = r7.A00
            long r1 = r8.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00b1
            java.util.List r1 = r7.A0B
            java.util.List r0 = r8.A0B
            if (r1 != 0) goto L_0x0086
            if (r0 != 0) goto L_0x00b1
        L_0x005f:
            java.lang.String r1 = r7.A09
            java.lang.String r0 = r8.A09
            if (r1 != 0) goto L_0x007f
            if (r0 != 0) goto L_0x00b1
        L_0x0067:
            X.6aY r1 = r7.A05
            X.6aY r0 = r8.A05
            if (r1 != 0) goto L_0x0078
            if (r0 != 0) goto L_0x00b1
        L_0x006f:
            boolean r1 = r7.A0D
            boolean r0 = r8.A0D
            if (r1 != r0) goto L_0x00b1
            if (r5 == 0) goto L_0x00b1
            return r6
        L_0x0078:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00b1
            goto L_0x006f
        L_0x007f:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00b1
            goto L_0x0067
        L_0x0086:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00b1
            goto L_0x005f
        L_0x008d:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00b1
            goto L_0x0049
        L_0x0094:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00b1
            goto L_0x003b
        L_0x009b:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00b1
            goto L_0x0033
        L_0x00a2:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00b1
            goto L_0x002b
        L_0x00a9:
            if (r0 == 0) goto L_0x0014
            boolean r5 = r1.equals(r0)
            goto L_0x0015
        L_0x00b1:
            r6 = 0
        L_0x00b2:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C195349Xk.equals(java.lang.Object):boolean");
    }

    public static C195349Xk A00(ARRequestAsset$CompressionMethod aRRequestAsset$CompressionMethod, AnonymousClass9JU r23, C192479Jx r24, VersionedCapability versionedCapability, String str, String str2, String str3, String str4, String str5, int i, long j) {
        String str6 = str2;
        return new C195349Xk(ARAssetType.SUPPORT, aRRequestAsset$CompressionMethod, r23, (EffectAssetType) null, r24, versionedCapability, str, (String) null, str6, str6, str3, str4, (String) null, str5, (String) null, (List) null, i, j, 0);
    }

    public static C195349Xk A01(ARRequestAsset$CompressionMethod aRRequestAsset$CompressionMethod, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, long j, long j2) {
        return new C195349Xk(ARAssetType.EFFECT, aRRequestAsset$CompressionMethod, AnonymousClass9JU.MD5, EffectAssetType.NORMAL_EFFECT, (C192479Jx) null, (VersionedCapability) null, "1001", "", str, str2, str3, str4, str5, str6, str7, list, -1, j, j2);
    }

    public String A03() {
        return this.A02.A0A;
    }

    public int hashCode() {
        return this.A02.A0A.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass9WL r1 = this.A02;
        ByteBuffer allocate = ByteBuffer.allocate(ZipDecompressor.UNZIP_BUFFER_SIZE);
        allocate.putLong(7310021016723351138L);
        AnonymousClass9WL.A01(r1.A0A, allocate);
        AnonymousClass9WL.A01(r1.A0B, allocate);
        AnonymousClass9WL.A01(r1.A0C, allocate);
        AnonymousClass9WL.A01(r1.A02.name(), allocate);
        AnonymousClass9WL.A01(r1.A04(), allocate);
        AnonymousClass9WL.A01(r1.A0D, allocate);
        AnonymousClass9WL.A01(r1.A03.name(), allocate);
        allocate.putInt(r1.A01);
        AnonymousClass9WL.A01(r1.A09, allocate);
        AnonymousClass9WL.A01(r1.A08.toString(), allocate);
        AnonymousClass9WL.A01(C18270x1.A0T(r1.A06), allocate);
        AnonymousClass9WL.A01(r1.A07.toString(), allocate);
        AnonymousClass9WL.A01(r1.A0E, allocate);
        parcel.writeByteArray(Arrays.copyOf(allocate.array(), allocate.position()));
        parcel.writeString(this.A08);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A07);
        parcel.writeByte(this.A0C ? (byte) 1 : 0);
        parcel.writeString(this.A06);
        parcel.writeLong(this.A00);
        parcel.writeLong(this.A01);
        parcel.writeTypedList(this.A0B);
        parcel.writeString(this.A09);
        parcel.writeTypedList(this.A05);
        parcel.writeByte(this.A0D ? (byte) 1 : 0);
        int i2 = 0;
        parcel.writeParcelable(this.A04, 0);
        AnonymousClass9JU r0 = this.A03;
        if (r0 != null) {
            i2 = r0.ordinal();
        }
        parcel.writeInt(i2);
    }

    public C195349Xk(Parcel parcel) {
        C129586aY copyOf;
        try {
            this.A02 = new AnonymousClass9WL(ByteBuffer.wrap(parcel.createByteArray()));
            this.A08 = parcel.readString();
            this.A0A = parcel.readString();
            this.A07 = parcel.readString();
            boolean z = true;
            this.A0C = AnonymousClass000.A1S(parcel.readByte());
            this.A06 = parcel.readString();
            this.A00 = parcel.readLong();
            this.A01 = parcel.readLong();
            this.A0B = parcel.createTypedArrayList(ARCapabilityMinVersionModeling.CREATOR);
            this.A09 = parcel.readString();
            ArrayList createTypedArrayList = parcel.createTypedArrayList(AREffectAsyncAsset.CREATOR);
            if (createTypedArrayList == null) {
                copyOf = null;
            } else {
                copyOf = C129586aY.copyOf((Collection) createTypedArrayList);
            }
            this.A05 = copyOf;
            this.A0D = parcel.readByte() == 0 ? false : z;
            this.A04 = (C195359Xl) C18280x3.A0C(parcel, C195359Xl.class);
            this.A03 = AnonymousClass9JU.values()[parcel.readInt()];
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String toString() {
        String name;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("id: ");
        AnonymousClass9WL r5 = this.A02;
        A0o.append(r5.A0A);
        A0o.append(", name: ");
        A0o.append(r5.A0C);
        A0o.append(", instance id: ");
        A0o.append(r5.A0B);
        A0o.append(", cache key: ");
        A0o.append(r5.A09);
        A0o.append(", asset type: ");
        ARAssetType aRAssetType = r5.A02;
        A0o.append(aRAssetType);
        A0o.append(", sub asset type: ");
        A0o.append(r5.A04());
        A0o.append(", compression method: ");
        A0o.append(r5.A03);
        A0o.append(", uri: ");
        A0o.append(this.A0A);
        A0o.append(", file size bytes: ");
        A0o.append(this.A00);
        A0o.append(", hash value: ");
        A0o.append(this.A06);
        A0o.append(", hash type: ");
        AnonymousClass9JU r0 = this.A03;
        if (r0 == null) {
            name = "null";
        } else {
            name = r0.name();
        }
        A0o.append(name);
        A0o.append(", is logging disabled: ");
        A0o.append(this.A0C);
        A0o.append(", is asset encrypted: ");
        A0o.append(r5.A07.booleanValue());
        A0o.append(", uses flm capability: ");
        A0o.append(this.A0D);
        if (aRAssetType == ARAssetType.EFFECT) {
            A0o.append(", model capability minVersion: ");
            A0o.append(this.A0B);
        }
        return A0o.toString();
    }

    public String A02() {
        return this.A08;
    }

    public String A04() {
        return this.A0A;
    }

    public int describeContents() {
        return 0;
    }

    public C195349Xk(ARAssetType aRAssetType, ARRequestAsset$CompressionMethod aRRequestAsset$CompressionMethod, AnonymousClass9JU r21, EffectAssetType effectAssetType, C192479Jx r23, VersionedCapability versionedCapability, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, int i, long j, long j2) {
        String str10 = str;
        ARRequestAsset$CompressionMethod aRRequestAsset$CompressionMethod2 = aRRequestAsset$CompressionMethod;
        if (aRRequestAsset$CompressionMethod != null) {
            String str11 = str2;
            C192479Jx r7 = r23;
            EffectAssetType effectAssetType2 = effectAssetType;
            ARAssetType aRAssetType2 = aRAssetType;
            VersionedCapability versionedCapability2 = versionedCapability;
            this.A02 = new AnonymousClass9WL(aRAssetType2, aRRequestAsset$CompressionMethod2, effectAssetType2, (C192449Ju) null, r7, versionedCapability2, false, (Boolean) null, str10, str11, str3, str7, str8, (String) null, i);
            this.A0A = str5;
            this.A08 = str4;
            this.A06 = str6;
            this.A0C = false;
            this.A07 = str10;
            this.A00 = j;
            this.A01 = j2;
            this.A0B = list;
            this.A09 = str9;
            this.A05 = null;
            this.A04 = null;
            this.A0D = false;
            this.A03 = r21;
            return;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Compression method must not be null: id=");
        throw AnonymousClass000.A0F(str10, A0o);
    }
}
