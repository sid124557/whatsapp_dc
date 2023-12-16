package org.npci.upi.security.pinactivitycomponent;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0x9;
import X.AnonymousClass7TF;
import X.C147587Ew;
import X.C18330xA;
import X.C48812fW;
import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class u {
    public Context A00;
    public List A01;
    public JSONArray A02 = AnonymousClass0x9.A1F();
    public C147587Ew A03;

    public AnonymousClass7TF A01(String str, String str2, int i) {
        String str3;
        C48812fW r3;
        String str4;
        int i2 = 0;
        while (true) {
            try {
                JSONArray jSONArray = this.A02;
                if (i2 >= jSONArray.length()) {
                    return null;
                }
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                try {
                    JSONArray jSONArray2 = jSONObject.getJSONArray("sender");
                    int i3 = 0;
                    while (true) {
                        if (i3 >= jSONArray2.length()) {
                            continue;
                            break;
                        } else if (!Pattern.compile(jSONArray2.getString(i3), 2).matcher(str).find()) {
                            i3++;
                        } else if (!Pattern.compile(jSONObject.getString("message"), 2).matcher(str2).find()) {
                            continue;
                        } else {
                            if (i != 0) {
                                StringBuilder A0o = AnonymousClass001.A0o();
                                A0o.append("\\d{");
                                A0o.append(i);
                                str3 = AnonymousClass000.A0g(A0o);
                            } else {
                                str3 = (String) jSONObject.get("otp");
                            }
                            Matcher matcher = Pattern.compile(str3).matcher(str2);
                            AnonymousClass7TF r4 = new AnonymousClass7TF();
                            r4.A00 = str2;
                            if (matcher.find() && matcher.groupCount() >= 0) {
                                r4.A01 = matcher.group(0);
                                if (str2.contains("Aadhaar") || str2.contains("AADHAAR")) {
                                    r3 = new C48812fW(this.A00);
                                    str4 = "otp_type_aadhaar";
                                } else {
                                    r3 = new C48812fW(this.A00);
                                    str4 = "otp_type_bank";
                                }
                                String str5 = r4.A01;
                                SharedPreferences.Editor edit = r3.A01.edit();
                                edit.putString(str4, str5);
                                edit.commit();
                                return r4;
                            }
                        }
                    }
                } catch (JSONException unused) {
                }
                i2++;
            } catch (Exception unused2) {
                return null;
            }
        }
    }

    public u(Context context) {
        this.A00 = context;
        this.A03 = new C147587Ew(context);
        try {
            ByteArrayOutputStream A0e = AnonymousClass0x9.A0e();
            InputStream open = context.getAssets().open(AnonymousClass000.A0V("npci/", "npci_otp_rules.json", AnonymousClass001.A0o()));
            byte[] bArr = new byte[ZipDecompressor.UNZIP_BUFFER_SIZE];
            while (true) {
                int read = open.read(bArr);
                if (read == -1) {
                    break;
                }
                A0e.write(bArr, 0, read);
            }
            A0e.close();
            open.close();
            byte[] byteArray = A0e.toByteArray();
            if (byteArray != null) {
                try {
                    this.A02 = new JSONArray(new String(byteArray));
                } catch (Exception unused) {
                }
            }
        } catch (FileNotFoundException e) {
            throw C18330xA.A09(e);
        } catch (IOException e2) {
            throw C18330xA.A09(e2);
        } catch (Exception e3) {
            throw C18330xA.A09(e3);
        }
    }

    public static String A00(String str) {
        String lowerCase = str.toLowerCase();
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(lowerCase.getBytes(), 0, lowerCase.length());
            String bigInteger = new BigInteger(1, instance.digest()).toString(16);
            while (bigInteger.length() < 32) {
                bigInteger = AnonymousClass000.A0V("0", bigInteger, AnonymousClass001.A0o());
            }
            return bigInteger;
        } catch (Exception unused) {
            return null;
        }
    }
}
