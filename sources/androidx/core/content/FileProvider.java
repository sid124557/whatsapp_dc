package androidx.core.content;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0RO;
import X.C02650Hb;
import X.C07880cy;
import X.C15740rr;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

public class FileProvider extends ContentProvider {
    public static final File A02 = AnonymousClass002.A0B("/");
    public static final HashMap A03 = AnonymousClass001.A0t();
    public static final String[] A04 = {"_display_name", "_size"};
    public int A00;
    public C15740rr A01;

    public static Uri A00(Context context, File file, String str) {
        C07880cy r4 = (C07880cy) A01(context, str, 0);
        try {
            String canonicalPath = file.getCanonicalPath();
            Iterator A0u = AnonymousClass001.A0u(r4.A01);
            Map.Entry entry = null;
            while (A0u.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0u);
                String path = ((File) A0w.getValue()).getPath();
                if (canonicalPath.startsWith(path) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                    entry = A0w;
                }
            }
            if (entry != null) {
                String path2 = ((File) entry.getValue()).getPath();
                boolean endsWith = path2.endsWith("/");
                int length = path2.length();
                if (!endsWith) {
                    length++;
                }
                String substring = canonicalPath.substring(length);
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append(Uri.encode((String) entry.getKey()));
                A0o.append('/');
                return new Uri.Builder().scheme("content").authority(r4.A00).encodedPath(AnonymousClass000.A0X(Uri.encode(substring, "/"), A0o)).build();
            }
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("Failed to find configured root that contains ");
            throw AnonymousClass000.A0F(canonicalPath, A0o2);
        } catch (IOException unused) {
            throw AnonymousClass000.A0E(file, "Failed to resolve canonical path for ", AnonymousClass001.A0o());
        }
    }

    public static C15740rr A01(Context context, String str, int i) {
        C07880cy r4;
        IllegalArgumentException illegalArgumentException;
        IllegalArgumentException illegalArgumentException2;
        File file;
        File[] A002;
        HashMap hashMap = A03;
        synchronized (hashMap) {
            C15740rr r42 = (C15740rr) hashMap.get(str);
            r4 = r42;
            if (r42 == null) {
                try {
                    C07880cy r43 = new C07880cy(str);
                    ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(str, 128);
                    if (resolveContentProvider != null) {
                        if (resolveContentProvider.metaData == null && i != 0) {
                            Bundle bundle = new Bundle(1);
                            resolveContentProvider.metaData = bundle;
                            bundle.putInt("android.support.FILE_PROVIDER_PATHS", i);
                        }
                        XmlResourceParser loadXmlMetaData = resolveContentProvider.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
                        if (loadXmlMetaData != null) {
                            while (true) {
                                int next = loadXmlMetaData.next();
                                if (next == 1) {
                                    hashMap.put(str, r43);
                                    r4 = r43;
                                    break;
                                } else if (next == 2) {
                                    String name = loadXmlMetaData.getName();
                                    String attributeValue = loadXmlMetaData.getAttributeValue((String) null, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                                    String attributeValue2 = loadXmlMetaData.getAttributeValue((String) null, "path");
                                    if ("root-path".equals(name)) {
                                        file = A02;
                                    } else if ("files-path".equals(name)) {
                                        file = context.getFilesDir();
                                    } else if ("cache-path".equals(name)) {
                                        file = context.getCacheDir();
                                    } else if ("external-path".equals(name)) {
                                        file = Environment.getExternalStorageDirectory();
                                    } else {
                                        if ("external-files-path".equals(name)) {
                                            A002 = AnonymousClass0RO.A01(context, (String) null);
                                        } else if ("external-cache-path".equals(name)) {
                                            A002 = AnonymousClass0RO.A00(context);
                                        } else if ("external-media-path".equals(name)) {
                                            A002 = C02650Hb.A00(context);
                                        } else {
                                            continue;
                                        }
                                        if (A002.length > 0) {
                                            file = A002[0];
                                        } else {
                                            continue;
                                        }
                                    }
                                    if (file != null) {
                                        String str2 = new String[]{attributeValue2}[0];
                                        if (str2 != null) {
                                            file = AnonymousClass002.A0A(file, str2);
                                        }
                                        if (TextUtils.isEmpty(attributeValue)) {
                                            illegalArgumentException2 = AnonymousClass001.A0c("Name must not be empty");
                                            break;
                                        }
                                        try {
                                            r43.A01.put(attributeValue, file.getCanonicalFile());
                                        } catch (IOException e) {
                                            illegalArgumentException2 = new IllegalArgumentException(AnonymousClass000.A0P(file, "Failed to resolve canonical path for ", AnonymousClass001.A0o()), e);
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        } else {
                            illegalArgumentException2 = AnonymousClass001.A0c("Missing android.support.FILE_PROVIDER_PATHS meta-data");
                        }
                    } else {
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("Couldn't find meta-data for provider with authority ");
                        illegalArgumentException2 = AnonymousClass000.A0F(str, A0o);
                    }
                    throw illegalArgumentException2;
                } catch (IOException e2) {
                    illegalArgumentException = new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                    throw illegalArgumentException;
                } catch (XmlPullParserException e3) {
                    illegalArgumentException = new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e3);
                    throw illegalArgumentException;
                }
            }
        }
        return r4;
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return this.A01.B7d(uri).delete() ? 1 : 0;
    }

    public String getType(Uri uri) {
        String mimeTypeFromExtension;
        File B7d = this.A01.B7d(uri);
        int lastIndexOf = B7d.getName().lastIndexOf(46);
        if (lastIndexOf < 0 || (mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(B7d.getName().substring(lastIndexOf + 1))) == null) {
            return "application/octet-stream";
        }
        return mimeTypeFromExtension;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        throw AnonymousClass002.A0G("No external inserts");
    }

    public boolean onCreate() {
        return true;
    }

    public ParcelFileDescriptor openFile(Uri uri, String str) {
        int i;
        File B7d = this.A01.B7d(uri);
        if ("r".equals(str)) {
            i = 268435456;
        } else if ("w".equals(str) || "wt".equals(str)) {
            i = 738197504;
        } else if ("wa".equals(str)) {
            i = 704643072;
        } else if ("rw".equals(str)) {
            i = 939524096;
        } else if ("rwt".equals(str)) {
            i = 1006632960;
        } else {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Invalid mode: ");
            throw AnonymousClass000.A0F(str, A0o);
        }
        return ParcelFileDescriptor.open(B7d, i);
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        Object valueOf;
        File B7d = this.A01.B7d(uri);
        String queryParameter = uri.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME);
        if (strArr == null) {
            strArr = A04;
        }
        String[] strArr3 = new String[r7];
        Object[] objArr = new Object[r7];
        int i2 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i2] = "_display_name";
                i = i2 + 1;
                if (queryParameter == null) {
                    valueOf = B7d.getName();
                } else {
                    valueOf = queryParameter;
                }
            } else if ("_size".equals(str3)) {
                strArr3[i2] = "_size";
                i = i2 + 1;
                valueOf = Long.valueOf(B7d.length());
            }
            objArr[i2] = valueOf;
            i2 = i;
        }
        String[] strArr4 = new String[i2];
        System.arraycopy(strArr3, 0, strArr4, 0, i2);
        Object[] objArr2 = new Object[i2];
        System.arraycopy(objArr, 0, objArr2, 0, i2);
        MatrixCursor matrixCursor = new MatrixCursor(strArr4, 1);
        matrixCursor.addRow(objArr2);
        return matrixCursor;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw AnonymousClass002.A0G("No external updates");
    }

    public FileProvider(int i) {
        this.A00 = i;
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        } else if (providerInfo.grantUriPermissions) {
            String str = providerInfo.authority.split(";")[0];
            HashMap hashMap = A03;
            synchronized (hashMap) {
                hashMap.remove(str);
            }
            this.A01 = A01(context, str, this.A00);
        } else {
            throw new SecurityException("Provider must grant uri permissions");
        }
    }

    public FileProvider() {
        this.A00 = 0;
    }
}
