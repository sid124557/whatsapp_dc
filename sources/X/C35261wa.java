package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.1wa  reason: invalid class name and case insensitive filesystem */
public class C35261wa extends C41032Ir {
    public C35261wa() {
        C56052rL A04 = C56052rL.A04("api_version");
        C56052rL.A0C(A04, "value", 4);
        C41032Ir.A0A(A04, this);
    }

    public C35261wa(C27991fJ r3, C35331wh r4) {
        C56052rL A02 = C56052rL.A02();
        C56052rL.A06(r3, A02, "from");
        C41032Ir.A0C(A02, r4, this);
    }

    public C35261wa(C27991fJ r9, Long l) {
        C56052rL A04 = C56052rL.A04("item");
        C56052rL.A06(r9, A04, "jid");
        if (C626836d.A0J(l, -1, 9007199254740991L, false)) {
            C56052rL.A0A(A04, l, "mute");
        }
        C41032Ir.A0A(A04, this);
    }

    public C35261wa(C35381wm r2) {
        C41032Ir.A0C(C56052rL.A04("single_serialized_lookup"), r2, this);
    }

    public C35261wa(C35431wr r2, C35331wh r3) {
        C56052rL A02 = C56052rL.A02();
        C41032Ir.A09(A02, r3);
        C41032Ir.A0D(A02, r2, this);
    }

    public C35261wa(C95804uY r3, C35331wh r4) {
        C56052rL A02 = C56052rL.A02();
        C56052rL.A06(r3, A02, "from");
        C41032Ir.A0C(A02, r4, this);
    }

    public C35261wa(Long l, Long l2) {
        C56052rL A04 = C56052rL.A04("get_disclosure_stage_by_id");
        if (C626836d.A0J(l, 0, 9007199254740991L, false)) {
            C56052rL.A0A(A04, l, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        }
        Long l3 = l2;
        if (C626836d.A0J(l3, 0, 9007199254740991L, false)) {
            C56052rL.A0A(A04, l3, "t");
        }
        C41032Ir.A0A(A04, this);
    }

    public C35261wa(Long l, String str, String str2, String str3, String str4) {
        C56052rL A04 = C56052rL.A04("extension_screen");
        String str5 = str;
        if (C626836d.A0M(str5, 0, 9007199254740991L, false)) {
            C56052rL.A0D(A04, "extension_id", str5);
        }
        String str6 = str2;
        if (C626836d.A0M(str6, 0, 9007199254740991L, false)) {
            C56052rL.A0D(A04, "session_id", str6);
        }
        Long l2 = l;
        if (C626836d.A0J(l2, 0, 9007199254740991L, false)) {
            C56052rL.A0A(A04, l2, "t");
        }
        String str7 = str3;
        if (C626836d.A0M(str7, 0, 9007199254740991L, false)) {
            C56052rL.A0D(A04, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str7);
        }
        C56052rL A042 = C56052rL.A04("data");
        String str8 = str4;
        if (C626836d.A0M(str8, 0, 9007199254740991L, false)) {
            A042.A0J(str8);
        }
        C41032Ir.A06(A042, A04, this);
    }

    public C35261wa(String str, int i) {
        C56052rL A04;
        boolean z;
        long j;
        long j2;
        if (2 - i != 0) {
            A04 = C56052rL.A04("reason");
            z = false;
            j = 1;
            j2 = 100;
        } else {
            A04 = C56052rL.A04("after");
            z = false;
            j = 0;
            j2 = 9007199254740991L;
        }
        if (C626836d.A0M(str, j, j2, z)) {
            A04.A0J(str);
        }
        C41032Ir.A0A(A04, this);
    }

    public C35261wa(String str, String str2, String str3) {
        C56052rL A04 = C56052rL.A04("surface");
        if (C626836d.A0M(str, 0, 9007199254740991L, false)) {
            C56052rL.A0D(A04, PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        }
        String str4 = str2;
        if (str2 != null && C626836d.A0M(str4, 0, 9007199254740991L, true)) {
            C56052rL.A0D(A04, "promotion_id", str4);
        }
        String str5 = str3;
        if (str3 != null && C626836d.A0M(str5, 0, 9007199254740991L, true)) {
            C56052rL.A0D(A04, "instance_id", str5);
        }
        C41032Ir.A0A(A04, this);
    }

    public C35261wa(byte[] bArr) {
        C56052rL A04 = C56052rL.A04("key");
        C626836d.A0H(bArr, 0, 32);
        A04.A01 = bArr;
        C41032Ir.A0A(A04, this);
    }
}
