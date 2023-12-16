package X;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.cameracore.ardelivery.model.ARCapabilityMinVersionModeling;
import com.facebook.cameracore.ardelivery.model.AREffectAsyncAsset;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution;
import com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces.DeviceConfig;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9pb  reason: invalid class name and case insensitive filesystem */
public class C204589pb implements Parcelable.Creator {
    public final int A00;

    public C204589pb(int i) {
        this.A00 = i;
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Boolean bool;
        ArrayList arrayList;
        switch (this.A00) {
            case 0:
                return new ARCapabilityMinVersionModeling(parcel);
            case 1:
                return new AREffectAsyncAsset(parcel);
            case 2:
                return new C195349Xk(parcel);
            case 3:
                return new C195359Xl(parcel);
            case 4:
                return new EffectAttribution(parcel);
            case 5:
                return new EffectAttribution.AttributedAsset(parcel);
            case 6:
                return new EffectAttribution.License(parcel);
            case 7:
                return new AnonymousClass9XX(parcel);
            case 8:
                return new DeviceConfig(parcel);
            case 9:
                return new AnonymousClass945(parcel);
            case 10:
                AnonymousClass99K r1 = new AnonymousClass99K();
                r1.A09 = parcel.readString();
                r1.A03 = parcel.readString();
                r1.A07 = parcel.readString();
                r1.A04 = parcel.readString();
                r1.A05 = parcel.readString();
                r1.A00 = (C166557yt) C18280x3.A0C(parcel, C166557yt.class);
                r1.A02 = parcel.readString();
                r1.A01 = (AnonymousClass99H) C18280x3.A0C(parcel, AnonymousClass99H.class);
                return r1;
            case 11:
                return new C195309Xd(parcel);
            case 12:
                return new C195329Xi(parcel);
            case 13:
                return new AnonymousClass99D(parcel);
            case 14:
                AnonymousClass99H r12 = new AnonymousClass99H();
                r12.A0A = parcel.readString();
                Class<C166557yt> cls = C166557yt.class;
                r12.A03 = (C166557yt) C18280x3.A0C(parcel, cls);
                r12.A05 = (C166557yt) C18280x3.A0C(parcel, cls);
                r12.A07 = (C166557yt) C18280x3.A0C(parcel, cls);
                r12.A04 = (C166557yt) C18280x3.A0C(parcel, cls);
                r12.A08 = (C166557yt) C18280x3.A0C(parcel, cls);
                boolean z = false;
                r12.A0J = AnonymousClass000.A1U(parcel.readInt(), 1);
                r12.A06 = (C166557yt) C18280x3.A0C(parcel, cls);
                r12.A03 = parcel.readString();
                r12.A04 = parcel.readString();
                r12.A09 = (C166557yt) C18280x3.A0C(parcel, cls);
                r12.A0F = parcel.readString();
                r12.A0C = parcel.readString();
                r12.A01 = parcel.readInt();
                r12.A0D = parcel.readString();
                r12.A0E = parcel.readString();
                ArrayList A0s = AnonymousClass001.A0s();
                r12.A0G = A0s;
                parcel.readStringList(A0s);
                int readInt = parcel.readInt();
                if (readInt != 0) {
                    byte[] bArr = new byte[readInt];
                    r12.A09 = bArr;
                    parcel.readByteArray(bArr);
                }
                r12.A06 = parcel.readString();
                r12.A01 = (C166557yt) C18280x3.A0C(parcel, cls);
                r12.A02 = (C166557yt) C18280x3.A0C(parcel, cls);
                r12.A00 = parcel.readLong();
                r12.A07 = AnonymousClass000.A1U(parcel.readInt(), 1);
                r12.A08 = AnonymousClass000.A1U(parcel.readInt(), 1);
                r12.A0B = parcel.readString();
                r12.A0K = AnonymousClass000.A1U(parcel.readInt(), 1);
                r12.A0I = AnonymousClass000.A1U(parcel.readInt(), 1);
                if (parcel.readInt() == 1) {
                    z = true;
                }
                r12.A0H = z;
                return r12;
            case 15:
                return new C196499aw(parcel);
            case 16:
                AnonymousClass99L r13 = new AnonymousClass99L();
                r13.A0V(parcel);
                Class<C166557yt> cls2 = C166557yt.class;
                r13.A0D = (C166557yt) C18280x3.A0C(parcel, cls2);
                r13.A0U = parcel.readString();
                r13.A0S = parcel.readString();
                r13.A0Q = parcel.readString();
                r13.A0R = parcel.readString();
                Class<String> cls3 = String.class;
                r13.A0B = C1899693i.A0F(AnonymousClass3QD.A00(), cls3, parcel.readString(), "legalName");
                r13.A0O = parcel.readString();
                r13.A0P = parcel.readString();
                r13.A0A = C1899693i.A0F(AnonymousClass3QD.A00(), cls3, parcel.readString(), "legalName");
                r13.A05 = parcel.readLong();
                r13.A0J = parcel.readString();
                r13.A04 = parcel.readLong();
                r13.A01 = parcel.readInt();
                r13.A00 = parcel.readInt();
                r13.A02 = parcel.readInt();
                r13.A0V = parcel.readString();
                r13.A0C = (C166557yt) C18280x3.A0C(parcel, cls2);
                r13.A0K = parcel.readString();
                r13.A0T = parcel.readString();
                r13.A0M = parcel.readString();
                r13.A0N = parcel.readString();
                String readString = parcel.readString();
                if (readString != null) {
                    r13.A0G = new AnonymousClass9W2(readString);
                }
                int readInt2 = parcel.readInt();
                if (readInt2 > 0) {
                    bool = Boolean.TRUE;
                } else if (readInt2 == 0) {
                    bool = Boolean.FALSE;
                } else {
                    bool = null;
                }
                r13.A0I = bool;
                String readString2 = parcel.readString();
                if (readString2 != null) {
                    r13.A0H = new C196499aw(readString2);
                }
                String readString3 = parcel.readString();
                if (readString3 != null) {
                    r13.A0F = new AnonymousClass9V2(readString3);
                }
                r13.A0L = parcel.readString();
                r13.A07 = (C166557yt) C18280x3.A0C(parcel, cls2);
                r13.A0X = AnonymousClass001.A1T(parcel.readInt());
                r13.A08 = (C166557yt) C18280x3.A0C(parcel, cls2);
                r13.A09 = (C166557yt) C18280x3.A0C(parcel, cls2);
                r13.A0E = (AnonymousClass9XY) C18280x3.A0C(parcel, AnonymousClass9XY.class);
                String readString4 = parcel.readString();
                if (readString4 != null) {
                    try {
                        JSONArray jSONArray = new JSONArray(readString4);
                        arrayList = AnonymousClass001.A0s();
                        int length = jSONArray.length();
                        for (int i = 0; i < length; i++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            if (jSONObject != null) {
                                String string = jSONObject.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                                C162457s7.A0D(string);
                                arrayList.add(new C195299Xa(string));
                            }
                        }
                    } catch (JSONException e) {
                        Log.w("PAY: IndiaUpiTransactionOfferData/fromJsonArray threw: ", e);
                        arrayList = null;
                    }
                    r13.A0W = arrayList;
                }
                r13.A06 = (AnonymousClass39L) C18280x3.A0C(parcel, AnonymousClass39L.class);
                return r13;
            case 17:
                AnonymousClass99G r14 = new AnonymousClass99G();
                Class<C166557yt> cls4 = C166557yt.class;
                r14.A01 = (C166557yt) C18280x3.A0C(parcel, cls4);
                r14.A02 = parcel.readString();
                r14.A00 = parcel.readInt();
                r14.A03 = parcel.readString();
                r14.A03 = parcel.readString();
                r14.A04 = AnonymousClass001.A1T(parcel.readInt());
                r14.A05 = parcel.readString();
                r14.A06 = parcel.readString();
                r14.A02 = (C166557yt) C18280x3.A0C(parcel, cls4);
                r14.A00 = parcel.readLong();
                return r14;
            case 18:
                AnonymousClass99I r15 = new AnonymousClass99I();
                boolean z2 = false;
                r15.A0a = AnonymousClass000.A1U(parcel.readByte(), 1);
                r15.A08 = (C166557yt) C18280x3.A0C(parcel, C166557yt.class);
                r15.A0B = parcel.readString();
                r15.A0A = parcel.readString();
                r15.A0O = parcel.readString();
                r15.A0Q = AnonymousClass000.A1U(parcel.readByte(), 1);
                r15.A03 = parcel.readInt();
                r15.A0Y = AnonymousClass000.A1U(parcel.readByte(), 1);
                r15.A0U = AnonymousClass000.A1U(parcel.readByte(), 1);
                r15.A06 = parcel.readLong();
                r15.A04 = parcel.readInt();
                r15.A0G = parcel.readString();
                r15.A0H = parcel.readString();
                r15.A00 = parcel.readInt();
                r15.A0W = AnonymousClass000.A1U(parcel.readByte(), 1);
                r15.A0V = AnonymousClass000.A1U(parcel.readByte(), 1);
                r15.A0S = AnonymousClass000.A1U(parcel.readByte(), 1);
                r15.A0R = AnonymousClass000.A1U(parcel.readByte(), 1);
                r15.A0J = parcel.readString();
                r15.A05 = parcel.readLong();
                r15.A01 = parcel.readInt();
                r15.A07 = AnonymousClass000.A1U(parcel.readByte(), 1);
                if (parcel.readByte() == 1) {
                    z2 = true;
                }
                r15.A08 = z2;
                r15.A03 = parcel.readString();
                r15.A06 = parcel.readString();
                r15.A00 = parcel.readInt();
                r15.A04 = parcel.readString();
                r15.A01 = parcel.readInt();
                r15.A0C = parcel.readString();
                r15.A0E = parcel.readString();
                r15.A0D = parcel.readString();
                r15.A09 = Long.valueOf(parcel.readLong());
                r15.A05 = parcel.readString();
                r15.A0F = parcel.readString();
                r15.A0I = parcel.readString();
                boolean z3 = false;
                r15.A0P = AnonymousClass000.A1U(parcel.readByte(), 1);
                r15.A0Z = AnonymousClass000.A1U(parcel.readByte(), 1);
                r15.A0X = AnonymousClass000.A1U(parcel.readByte(), 1);
                if (parcel.readByte() == 1) {
                    z3 = true;
                }
                r15.A0T = z3;
                r15.A0N = parcel.readString();
                r15.A0M = parcel.readString();
                r15.A0L = parcel.readString();
                r15.A0K = parcel.readString();
                return r15;
            case 19:
                return new AnonymousClass99C(parcel);
            case 20:
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                int readInt3 = parcel.readInt();
                HashMap A0t = AnonymousClass001.A0t();
                for (int i2 = 0; i2 < readInt3; i2++) {
                    String readString8 = parcel.readString();
                    A0t.put(readString8, new C166257yO(readString8, parcel.readString()));
                }
                return new AnonymousClass99F(readString5, readString6, readString7, A0t);
            case 21:
                AnonymousClass99J r16 = new AnonymousClass99J();
                r16.A01 = parcel.readInt();
                r16.A09 = parcel.readString();
                r16.A0C = parcel.readString();
                r16.A03 = parcel.readString();
                r16.A03 = parcel.readString();
                r16.A07 = parcel.readString();
                r16.A04 = parcel.readString();
                r16.A05 = parcel.readString();
                r16.A02 = parcel.readLong();
                r16.A00 = parcel.readInt();
                r16.A02 = parcel.readString();
                r16.A06 = parcel.readString();
                r16.A04 = parcel.readString();
                boolean z4 = false;
                r16.A0E = AnonymousClass000.A1U(parcel.readByte(), 1);
                if (parcel.readByte() == 1) {
                    z4 = true;
                }
                r16.A0F = z4;
                r16.A0B = parcel.readString();
                r16.A08 = parcel.readString();
                r16.A00 = parcel.readInt();
                r16.A05 = parcel.readString();
                r16.A01 = parcel.readInt();
                return r16;
            case 22:
                AnonymousClass99M r17 = new AnonymousClass99M();
                r17.A0V(parcel);
                r17.A05 = parcel.readString();
                r17.A04 = parcel.readString();
                r17.A03 = parcel.readString();
                r17.A02 = (Boolean) parcel.readSerializable();
                r17.A06 = parcel.readString();
                r17.A01 = (C195319Xg) C18280x3.A0C(parcel, C195319Xg.class);
                return r17;
            default:
                return new C195339Xj(parcel);
        }
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new ARCapabilityMinVersionModeling[i];
            case 1:
                return new AREffectAsyncAsset[i];
            case 2:
                return new C195349Xk[i];
            case 3:
                return new C195359Xl[i];
            case 4:
                return new EffectAttribution[i];
            case 5:
                return new EffectAttribution.AttributedAsset[i];
            case 6:
                return new EffectAttribution.License[i];
            case 7:
                return new AnonymousClass9XX[i];
            case 8:
                return new DeviceConfig[i];
            case 9:
                return new AnonymousClass945[i];
            case 10:
                return new AnonymousClass99K[i];
            case 11:
                return new C195309Xd[i];
            case 12:
                return new C195329Xi[i];
            case 13:
                return new AnonymousClass99D[i];
            case 14:
                return new AnonymousClass99H[i];
            case 15:
                return new C196499aw[i];
            case 16:
                return new AnonymousClass99L[i];
            case 17:
                return new AnonymousClass99G[i];
            case 18:
                return new AnonymousClass99I[i];
            case 19:
                return new AnonymousClass99C[i];
            case 20:
                return new AnonymousClass99F[i];
            case 21:
                return new AnonymousClass99J[i];
            case 22:
                return new AnonymousClass99M[0];
            default:
                return new C195339Xj[i];
        }
    }
}
