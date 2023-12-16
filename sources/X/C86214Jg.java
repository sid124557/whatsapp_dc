package X;

import android.net.Uri;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.4Jg  reason: invalid class name and case insensitive filesystem */
public class C86214Jg implements C84134Bd {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public C86214Jg(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A04 = i;
        this.A00 = obj2;
        this.A01 = obj4;
        this.A02 = obj;
        this.A03 = obj3;
    }

    public final void AwB(Object obj) {
        C53832nk r14;
        C613530j r6;
        C54052o6 r5;
        AnonymousClass4DQ r4;
        Object obj2;
        String str;
        Map A042;
        Object obj3;
        AnonymousClass4FV r42;
        int i;
        Object obj4 = obj;
        switch (this.A04) {
            case 0:
                C621033m.A00((Uri) obj4, (C111095hX) this.A02, (C621033m) this.A00, (C30471mV) this.A03, (WeakReference) this.A01);
                return;
            case 1:
                C42762Pk r8 = (C42762Pk) this.A00;
                File file = (File) this.A01;
                AnonymousClass3QO r52 = (AnonymousClass3QO) this.A02;
                AnonymousClass2NS r43 = (AnonymousClass2NS) this.A03;
                Number number = (Number) obj4;
                C18260x0.A1R(AnonymousClass001.A0o(), "external-mutations-uploader: media-job-finished for upload, mediaJobResult: ", number);
                long length = file.length();
                file.delete();
                r52.A03();
                int intValue = number.intValue();
                if (intValue == 0) {
                    C149897Oi A022 = r52.A02();
                    if (A022 != null) {
                        C56752sV r0 = A022.A02;
                        String A043 = r0.A04();
                        String A032 = r0.A03();
                        String A06 = r0.A06();
                        String A05 = r0.A05();
                        AnonymousClass32B A002 = r0.A00();
                        if (A002 == null || TextUtils.isEmpty(A043) || TextUtils.isEmpty(A032) || TextUtils.isEmpty(A06) || TextUtils.isEmpty(A05)) {
                            StringBuilder A0o = AnonymousClass001.A0o();
                            A0o.append("create-external-blob-reference response is missing field/s; handle = ");
                            A0o.append(A043);
                            A0o.append("; directPath = ");
                            A0o.append(A032);
                            A0o.append("; mediaHash = ");
                            A0o.append(A06);
                            A0o.append("; mediaEncHash = ");
                            A0o.append(A05);
                            C18260x0.A1Q(A0o, "; mediaKey = ", A002);
                        } else {
                            C130546c9 A0G = AnonymousClass1DW.DEFAULT_INSTANCE.A0G();
                            byte[] bArr = A002.A01;
                            C172548Lq A0J = C18300x5.A0J(A0G, bArr, bArr.length);
                            AnonymousClass1DW r1 = (AnonymousClass1DW) A0G.A00;
                            r1.bitField0_ |= 1;
                            r1.mediaKey_ = A0J;
                            AnonymousClass1DW r12 = (AnonymousClass1DW) C18320x8.A0C(A0G);
                            A032.getClass();
                            r12.bitField0_ |= 2;
                            r12.directPath_ = A032;
                            AnonymousClass1DW r13 = (AnonymousClass1DW) C18320x8.A0C(A0G);
                            A043.getClass();
                            r13.bitField0_ |= 4;
                            r13.handle_ = A043;
                            AnonymousClass1DW r15 = (AnonymousClass1DW) C18320x8.A0C(A0G);
                            r15.bitField0_ |= 8;
                            r15.fileSizeBytes_ = length;
                            C172548Lq A08 = C18270x1.A08(A0G, A06);
                            AnonymousClass1DW r16 = (AnonymousClass1DW) A0G.A00;
                            r16.bitField0_ |= 16;
                            r16.fileSha256_ = A08;
                            C172548Lq A082 = C18270x1.A08(A0G, A05);
                            AnonymousClass1DW r17 = (AnonymousClass1DW) A0G.A00;
                            r17.bitField0_ |= 32;
                            r17.fileEncSha256_ = A082;
                            AnonymousClass1DW r3 = (AnonymousClass1DW) A0G.A06();
                            if (r3 != null) {
                                C18260x0.A1R(AnonymousClass001.A0o(), "external-mutations-uploader: media-job-finished for upload with response = ", r3);
                                C47552dR r2 = r43.A02;
                                r2.A04 = r3;
                                r2.A07 = null;
                                r43.A00.A05(r2.A00());
                                return;
                            }
                        }
                    }
                    Log.i("external-mutations-uploader: media-job-finished for upload but response has missing fields");
                } else if (C154357d2.A01(r8.A01, intValue)) {
                    r43.A00.A06(new C23331Se(AnonymousClass000.A1U(intValue, 8), "prepare-syncd-mutations-helper/startPrepareJob/onTransientFailure: Upload error"));
                    return;
                }
                r43.A00.A06(new C23321Sd("prepare-syncd-mutations-helper/startPrepareJob/onFailed: Upload error", (Exception) null));
                return;
            case 2:
                r6 = (C613530j) this.A00;
                r5 = (C54052o6) this.A01;
                r14 = (C53832nk) this.A02;
                r4 = (AnonymousClass4DQ) this.A03;
                AnonymousClass3Z6 r7 = (AnonymousClass3Z6) obj4;
                C162457s7.A0J(r7, 5);
                AnonymousClass1Uc r32 = r6.A0M;
                boolean A1Z = AnonymousClass001.A1Z(r7.first);
                int hashCode = r5.A05.hashCode();
                r32.A05(hashCode, "psl_cache_hit", A1Z);
                if (AnonymousClass001.A1Z(r7.first)) {
                    r6.A0O.A06(hashCode, 2);
                    obj2 = r7.second;
                    if (obj2 == null) {
                        throw C18300x5.A0X();
                    }
                } else {
                    r6.A02(r5, r14, r4);
                    return;
                }
                break;
            case 3:
                r6 = (C613530j) this.A00;
                r5 = (C54052o6) this.A01;
                r14 = (C53832nk) this.A02;
                r4 = (AnonymousClass4DQ) this.A03;
                AnonymousClass3Z6 r72 = (AnonymousClass3Z6) obj4;
                C162457s7.A0J(r72, 5);
                short s = 3;
                if (AnonymousClass001.A1Z(r72.first)) {
                    s = 2;
                }
                r6.A0O.A06(r5.A05.hashCode(), s);
                if (AnonymousClass001.A1Z(r72.first)) {
                    obj2 = r72.second;
                    if (obj2 == null) {
                        throw C18300x5.A0X();
                    }
                } else {
                    return;
                }
                break;
            default:
                C620033c r53 = (C620033c) this.A00;
                AnonymousClass3QO r62 = (AnonymousClass3QO) this.A01;
                Object obj5 = this.A02;
                AnonymousClass3XA r33 = (AnonymousClass3XA) this.A03;
                C149897Oi r73 = (C149897Oi) obj4;
                Log.d("mediajobmanager/mediaupload/response");
                int i2 = r73.A00;
                if (r62.A05()) {
                    AnonymousClass1VX r18 = r53.A06;
                    if (C154357d2.A01(r18, i2) || 27 == i2) {
                        if (C154357d2.A01(r18, i2)) {
                            Log.e("mediaJobManager/mediaUpload/whenResponse; express path upload failed, fallback to normal upload");
                            r42 = r53.A07;
                            i = 24;
                        } else {
                            if (27 == i2) {
                                Log.e("mediaJobManager/mediaUpload/whenResponse; express path upload no primary host, skip and fallback to normal upload");
                                r42 = r53.A07;
                                i = 26;
                            }
                            AnonymousClass4FS r22 = r53.A0N;
                            r62.A0M.A09(0);
                            r62.A0W = "mms";
                            C70343aL.A01(r22, r53, r62, new C61212zt(r62, r62.A00()), 41);
                            return;
                        }
                        Integer valueOf = Integer.valueOf(i);
                        C26061bW r19 = new C26061bW();
                        r19.A0H = C18310x6.A0e();
                        r19.A0I = null;
                        r19.A0J = valueOf;
                        r19.A0F = null;
                        r42.BhD(r19);
                        AnonymousClass4FS r222 = r53.A0N;
                        r62.A0M.A09(0);
                        r62.A0W = "mms";
                        C70343aL.A01(r222, r53, r62, new C61212zt(r62, r62.A00()), 41);
                        return;
                    }
                }
                if (obj5 instanceof C135406kc) {
                    AnonymousClass1VX r23 = r53.A06;
                    if ((C154357d2.A01(r23, i2) || 11 == i2) && r23.A0Y(C58422vE.A02, 3602)) {
                        r53.A0N.BkM(new C71433c6(r53, r62, new C61212zt(r62, r62.A00()), i2, 24));
                        return;
                    }
                }
                C619833a r110 = r62.A0M;
                synchronized (r110) {
                    r110.A0G = true;
                }
                C70343aL.A01(r53.A0N, r53, r62, r73, 40);
                r33.A02();
                return;
        }
        String str2 = (String) obj2;
        String str3 = r5.A05;
        C40292Fg r24 = r6.A0A;
        UserJid userJid = r5.A02;
        UserJid userJid2 = userJid;
        String str4 = r5.A08;
        String str5 = str4;
        Map A0F = C73813g7.A0F(AnonymousClass3Z6.A02("chat_jid", userJid), AnonymousClass3Z6.A02("key_msg_id", str4));
        HashMap hashMap = r24.A00;
        hashMap.clear();
        hashMap.putAll(A0F);
        AnonymousClass3Z6[] r10 = new AnonymousClass3Z6[17];
        String str6 = r5.A06;
        String str7 = r5.A04;
        if (C613530j.A00(str6, str7)) {
            str = "navigate";
        } else {
            str = "INIT";
        }
        AnonymousClass3Z6.A09("action", str, r10, 0);
        if (C613530j.A00(str6, str7)) {
            Map map = r5.A0A;
            Object obj6 = null;
            if (map != null) {
                obj3 = map.get("screen");
            } else {
                obj3 = null;
            }
            if (map != null) {
                obj6 = map.get("data");
            }
            AnonymousClass3Z6[] r74 = new AnonymousClass3Z6[2];
            AnonymousClass3Z6[] r25 = new AnonymousClass3Z6[2];
            AnonymousClass3Z6.A09(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, obj3, r25, 0);
            AnonymousClass3Z6.A09(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "screen", r25, 1);
            AnonymousClass3Z6.A09("next", C73813g7.A0F(r25), r74, 0);
            AnonymousClass3Z6.A09("data", obj6, r74, 1);
            A042 = C73813g7.A0F(r74);
        } else {
            A042 = C57692u3.A04("business_payload", C57692u3.A04("action", "INIT"));
        }
        AnonymousClass3Z6.A09("action_payload", A042, r10, 1);
        AnonymousClass3Z6.A09("message_id", str5, r10, 2);
        String str8 = r5.A09;
        AnonymousClass3Z6.A07("session_id", str8, r10);
        AnonymousClass3Z6.A08("product_qpl_session_id", AnonymousClass26l.A00(AnonymousClass000.A0V("wae", str8, AnonymousClass001.A0o())), r10);
        C54052o6.A00(r5, userJid2, str6, str3, r10);
        String str9 = r14.A00;
        r10[11] = AnonymousClass3Z6.A02("extension_status", str9);
        r10[12] = AnonymousClass3Z6.A02("user_locale", r6.A0E.A08());
        AnonymousClass3Z6[] r132 = new AnonymousClass3Z6[2];
        AnonymousClass3Z6.A09(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "modal", r132, 0);
        AnonymousClass3Z6.A09("modal_type", "bottom_sheet", r132, 1);
        r10[13] = AnonymousClass3Z6.A02("overwrite_first_screen_presentation", C57692u3.A04("style", C73813g7.A0F(r132)));
        r10[14] = AnonymousClass3Z6.A02("action_name", "galaxy_message");
        r10[15] = AnonymousClass3Z6.A02("is_modal_on_screen", Boolean.TRUE);
        r10[16] = AnonymousClass3Z6.A02("flow_json_version", Integer.valueOf(r14.A01));
        Map A0F2 = C73813g7.A0F(r10);
        boolean A0P = C162457s7.A0P(str9, "DRAFT");
        C51052jC A003 = AnonymousClass25c.A00(str5, str3);
        C48182eU r11 = r6.A0R;
        String str10 = A003.A00;
        C152677Zw A004 = r11.A00(str10);
        if (!(!A0P || A004 == null || A004.A00() == null)) {
            if (r6.A0Q.A0Y(C58422vE.A02, 4819)) {
                C54522or A023 = r6.A0S.A02(r5.A03);
                C54292oU r75 = r6.A0C;
                A023.A01(new C69373Wt(C54292oU.A04(r75, R.string.f11nameremoved), C54292oU.A04(r75, R.string.f11nameremoved), C54292oU.A04(r75, R.string.f11nameremoved), new AnonymousClass40G(r6, r5, r4, A003, str2, A0F2), new AnonymousClass40H(r6, r5, r4, A003, str2, A0F2)));
                return;
            }
            r11.A01(str10);
        }
        if (C613530j.A00(str6, str7)) {
            r6.A0I.A03(userJid2, str3, str5, str8, new AnonymousClass45V(r6, r5, r4, A003, str2, A0F2, A0P));
            return;
        }
        r6.A04(r5, (AnonymousClass4B3) null, r4, A003, str2, A0F2, A0P);
    }
}
