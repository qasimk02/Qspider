package com.shoplify.repository;

import java.util.ArrayList;
import java.util.List;

import com.shoplify.model.HomeAppliances;
import com.shoplify.model.MobileAndLaptops;
import com.shoplify.model.Wearable;
import com.shoplify.util.AppConstants;

public class ElectronicsProductRepository {
	
	
	private static List<MobileAndLaptops> mobileAndLaptops;
	private static List<HomeAppliances>  homeAppliances;
	private static List<Wearable> wearables;
	
	
	 public static void init() {
         mobileAndLaptops = new ArrayList<>();
         homeAppliances = new ArrayList<>();
         wearables = new ArrayList<>();
         // mobiles
         mobileAndLaptops.add(new MobileAndLaptops(
                         "Galaxy S22 Ultra",
                         "Samsung",
                         100,
                         99999.99,
                         10,
                         "Experience the ultimate in mobile technology with the Galaxy S22 Ultra. This flagship smartphone from Samsung features a stunning 6.8-inch Dynamic AMOLED display, delivering vibrant colors and deep blacks. Powered by the latest Snapdragon processor, it offers lightning-fast performance for seamless multitasking and gaming. Capture every moment in stunning detail with the quad-camera system, including a 108MP main sensor and a 10x optical zoom lens. With 5G connectivity, long-lasting battery life, and a sleek design, the Galaxy S22 Ultra redefines what's possible in a smartphone.",
                         true,
                         List.of("Phantom Black", "Phantom Silver", "Phantom Green"),
                         2,
                         228,
                         AppConstants.mobileCategory,
                         "Android 12",
                         "Snapdragon 8 Gen 2",
                         List.of("12GB", "16GB"),
                         List.of("256GB", "512GB", "1TB"),
                         "5000mAh",
                         "108MP + 12MP + 10MP + 10MP"));

         mobileAndLaptops.add(new MobileAndLaptops(
                         "Samsung Galaxy S22 Ultra",
                         "Samsung",
                         100,
                         72999.99, // Price in INR
                         10,
                         "Experience the ultimate in mobile technology with the Galaxy S22 Ultra. Crafted from high-quality materials, this phone offers an immersive experience with its stunning display and powerful performance.",
                         true,
                         List.of("Phantom Black", "Phantom Silver", "Phantom Green"),
                         1.5,
                         228,
                         AppConstants.mobileCategory,
                         "Android 12",
                         "Exynos 2200",
                         List.of("12GB", "16GB"),
                         List.of("256GB", "512GB", "1TB"),
                         "5000mAh",
                         "108MP + 12MP + 10MP + 10MP"));

         mobileAndLaptops.add(new MobileAndLaptops(
                         "Apple iPhone 13 Pro",
                         "Apple",
                         150,
                         81999.99, // Price in INR
                         8,
                         "Discover the power of innovation with the iPhone 13 Pro. Featuring a stunning design, powerful performance, and advanced camera system, it redefines what's possible in a smartphone.",
                         true,
                         List.of("Graphite", "Silver", "Gold", "Sierra Blue"),
                         1.5,
                         204,
                         "Smartphone",
                         "iOS 15",
                         "A15 Bionic",
                         List.of("6GB"),
                         List.of("128GB", "256GB", "512GB", "1TB"),
                         "3600mAh",
                         "12MP + 12MP + 12MP"));

         mobileAndLaptops.add(new MobileAndLaptops(
                         "Google Pixel 6 Pro",
                         "Google",
                         80,
                         64999.99, // Price in INR
                         5,
                         "Unleash your creativity with the Pixel 6 Pro. Featuring advanced camera capabilities, powerful performance, and a sleek design, it's the perfect companion for capturing and sharing your moments.",
                         true,
                         List.of("Stormy Black", "Cloudy White", "Sorta Sunny", "Lightning Yellow"),
                         2,
                         210,
                         AppConstants.mobileCategory,
                         "Android 12",
                         "Tensor",
                         List.of("12GB"),
                         List.of("128GB", "256GB", "512GB"),
                         "5000mAh",
                         "50MP + 12MP"));

         mobileAndLaptops.add(new MobileAndLaptops(
                         "OnePlus 10 Pro",
                         "OnePlus",
                         120,
                         58999.99, // Price in INR
                         7,
                         "Experience the next level of speed and performance with the OnePlus 10 Pro. Featuring a stunning display, powerful processor, and premium design, it's designed to impress.",
                         true,
                         List.of("Morning Haze", "Forest Green", "Starry Night"),
                         2,
                         196,
                         AppConstants.mobileCategory,
                         "Android 12",
                         "Snapdragon 8 Gen 2",
                         List.of("8GB", "12GB"),
                         List.of("128GB", "256GB", "512GB"),
                         "5000mAh",
                         "108MP + 50MP + 8MP + 2MP"));

         mobileAndLaptops.add(new MobileAndLaptops(
                         "Xiaomi Mi 12 Ultra",
                         "Xiaomi",
                         100,
                         59999.99, // Price in INR
                         6,
                         "Enter the era of innovation with the Xiaomi Mi 12 Ultra. Featuring top-of-the-line specs, cutting-edge features, and a premium design, it's the flagship phone you've been waiting for.",
                         true,
                         List.of("Obsidian Black", "Cobalt Blue", "Emerald Green"),
                         2,
                         204,
                         AppConstants.mobileCategory,
                         "Android 12",
                         "Snapdragon 8 Gen 2",
                         List.of("8GB", "12GB"),
                         List.of("256GB", "512GB", "1TB"),
                         "5000mAh",
                         "200MP + 50MP + 8MP + 2MP"));

         mobileAndLaptops.add(new MobileAndLaptops(
                         "Huawei P50 Pro",
                         "Huawei",
                         80,
                         74999.99, // Price in INR
                         5,
                         "Capture the world with the Huawei P50 Pro. Featuring a groundbreaking camera system, powerful performance, and elegant design, it's the smartphone that takes photography to the next level.",
                         true,
                         List.of("Golden Black", "Cocoa Gold", "Pearl White"),
                         2,
                         195,
                         AppConstants.mobileCategory,
                         "Android 12",
                         "Kirin 9000",
                         List.of("8GB", "12GB"),
                         List.of("128GB", "256GB"),
                         "4360mAh",
                         "50MP + 40MP + 12MP + 13MP"));

         mobileAndLaptops.add(new MobileAndLaptops(
                         "Sony Xperia 1 III",
                         "Sony",
                         90,
                         99999.99, // Price in INR
                         8,
                         "Experience photography reimagined with the Xperia 1 III. Featuring a professional-grade camera system and top-of-the-line specs, it's the ultimate smartphone for capturing and creating.",
                         true,
                         List.of("Frosted Black", "Frosted Purple", "Frosted Gray"),
                         2,
                         186,
                         AppConstants.mobileCategory,
                         "Android 12",
                         "Snapdragon 888",
                         List.of("12GB"),
                         List.of("256GB"),
                         "4500mAh",
                         "12MP + 12MP + 12MP + 0.3MP"));

         mobileAndLaptops.add(new MobileAndLaptops(
                         "ASUS ROG Phone 5 Ultimate",
                         "ASUS",
                         80,
                         149999.99, // Price in INR
                         10,
                         "Unleash your gaming potential with the ROG Phone 5 Ultimate. Designed for gamers by gamers, it offers top-of-the-line specs, advanced gaming features, and a unique design that sets it apart.",
                         true,
                         List.of("Phantom Black"),
                         2,
                         238,
                         AppConstants.mobileCategory,
                         "Android 11",
                         "Snapdragon 888",
                         List.of("18GB"),
                         List.of("512GB"),
                         "6000mAh",
                         "64MP + 13MP + 5MP"));

         // laptops

         mobileAndLaptops.add(new MobileAndLaptops(
                         "Dell XPS 15",
                         "Dell",
                         100,
                         134999.99, // Price in INR
                         8,
                         "Experience performance and style with the Dell XPS 15. Featuring a stunning 15.6-inch InfinityEdge display, powerful Intel Core processor, and sleek design, it's the perfect blend of beauty and performance.",
                         true,
                         List.of("Platinum Silver", "Frost White"),
                         1.5,
                         1.8,
                         AppConstants.laptopCategory,
                         "Windows 11",
                         "Intel Core i7",
                         List.of("16GB", "32GB", "64GB"),
                         List.of("512GB SSD", "1TB SSD", "2TB SSD"),
                         "Up to 12 hours",
                         "Integrated"));

         mobileAndLaptops.add(new MobileAndLaptops(
                         "MacBook Pro 14",
                         "Apple",
                         120,
                         139999.99, // Price in INR
                         8,
                         "Elevate your productivity with the MacBook Pro 14. Featuring Apple's M1 Pro chip, stunning Liquid Retina XDR display, and all-day battery life, it's the ultimate tool for creative professionals.",
                         true,
                         List.of("Space Gray", "Silver"),
                         1.4,
                         1.6,
                         "Laptop",
                         "macOS Monterey",
                         "Apple M1 Pro",
                         List.of("16GB", "32GB", "64GB"),
                         List.of("512GB SSD", "1TB SSD", "2TB SSD"),
                         "Up to 17 hours",
                         "Integrated"));

         mobileAndLaptops.add(new MobileAndLaptops(
                         "HP Spectre x360",
                         "HP",
                         80,
                         124999.99, // Price in INR
                         6,
                         "Experience versatility and performance with the HP Spectre x360. Featuring a 360-degree hinge, stunning OLED display, and powerful Intel Core processor, it's the perfect companion for work and play.",
                         true,
                         List.of("Nightfall Black", "Poseidon Blue", "Natural Silver"),
                         1.3,
                         1.3,
                         AppConstants.laptopCategory,
                         "Windows 11",
                         "Intel Core i7",
                         List.of("16GB", "32GB"),
                         List.of("512GB SSD", "1TB SSD"),
                         "Up to 14 hours",
                         "Integrated"));

         mobileAndLaptops.add(new MobileAndLaptops(
                         "Lenovo ThinkPad X1 Carbon",
                         "Lenovo",
                         90,
                         109999.99, // Price in INR
                         7,
                         "Maximize productivity with the Lenovo ThinkPad X1 Carbon. Featuring a lightweight design, powerful Intel Core processor, and robust security features, it's the ideal choice for business professionals.",
                         true,
                         List.of("Black"),
                         1.09,
                         1.13,
                         AppConstants.laptopCategory,
                         "Windows 11",
                         "Intel Core i7",
                         List.of("16GB", "32GB", "64GB"),
                         List.of("512GB SSD", "1TB SSD"),
                         "Up to 15 hours",
                         "Integrated"));

         mobileAndLaptops.add(new MobileAndLaptops(
                         "Asus ZenBook 14",
                         "Asus",
                         100,
                         89999.99, // Price in INR
                         5,
                         "Unleash your creativity with the Asus ZenBook 14. Featuring a compact design, vibrant display, and powerful AMD Ryzen processor, it's the perfect companion for on-the-go productivity.",
                         true,
                         List.of("Pine Grey", "Lilac Mist"),
                         1.19,
                         1.17,
                         "Laptop",
                         "Windows 11",
                         "AMD Ryzen 7",
                         List.of("16GB", "32GB"),
                         List.of("512GB SSD", "1TB SSD"),
                         "Up to 12 hours",
                         "Integrated"));

         mobileAndLaptops.add(new MobileAndLaptops(
                         "Acer Predator Helios 300",
                         "Acer",
                         80,
                         99999.99, // Price in INR
                         8,
                         "Dominate the battlefield with the Acer Predator Helios 300. Featuring powerful specs, advanced cooling technology, and a sleek design, it's the ultimate gaming machine for enthusiasts.",
                         true,
                         List.of("Abyssal Black"),
                         1.9,
                         2.5,
                         AppConstants.laptopCategory,
                         "Windows 11",
                         "Intel Core i7",
                         List.of("16GB", "32GB", "64GB"),
                         List.of("512GB SSD", "1TB SSD"),
                         "Up to 8 hours",
                         "Dedicated NVIDIA GPU"));

         mobileAndLaptops.add(new MobileAndLaptops(
                         "MacBook Air M1",
                         "Apple",
                         150,
                         94999.99, // Price in INR
                         8,
                         "Experience power and portability with the MacBook Air M1. Featuring Apple's M1 chip, stunning Retina display, and all-day battery life, it's the perfect companion for everyday tasks.",
                         true,
                         List.of("Space Gray", "Silver", "Gold"),
                         1.29,
                         1.29,
                         AppConstants.laptopCategory,
                         "macOS Monterey",
                         "Apple M1",
                         List.of("8GB", "16GB"),
                         List.of("256GB SSD", "512GB SSD", "1TB SSD"),
                         "Up to 18 hours",
                         "Integrated"));

         mobileAndLaptops.add(new MobileAndLaptops(
                         "MacBook Pro 16",
                         "Apple",
                         100,
                         209999.99, // Price in INR
                         10,
                         "Unleash your creativity with the MacBook Pro 16. Featuring a stunning 16-inch Retina display, powerful M1 Pro chip, and advanced cooling system, it's the ultimate tool for professionals.",
                         true,
                         List.of("Space Gray", "Silver"),
                         1.9,
                         2.0,
                         AppConstants.laptopCategory,
                         "macOS Monterey",
                         "Apple M1 Pro",
                         List.of("16GB", "32GB", "64GB"),
                         List.of("512GB SSD", "1TB SSD", "2TB SSD", "4TB SSD"),
                         "Up to 21 hours",
                         "Integrated"));

         mobileAndLaptops.add(new MobileAndLaptops(
                         "Dell Inspiron 15 7000",
                         "Dell",
                         120,
                         79999.99, // Price in INR
                         7,
                         "Enhance your productivity with the Dell Inspiron 15 7000. Featuring a sleek design, vibrant display, and powerful Intel Core processor, it's the perfect blend of style and performance for everyday computing.",
                         true,
                         List.of("Platinum Silver", "Alpine White"),
                         1.74,
                         1.75,
                         AppConstants.laptopCategory,
                         "Windows 11",
                         "Intel Core i5",
                         List.of("8GB", "16GB"),
                         List.of("512GB SSD", "1TB SSD", "2TB SSD"),
                         "Up to 10 hours",
                         "Integrated"));

         mobileAndLaptops.add(new MobileAndLaptops(
                         "Dell Latitude 14 5000",
                         "Dell",
                         80,
                         109999.99, // Price in INR
                         8,
                         "Stay productive on-the-go with the Dell Latitude 14 5000. Featuring a durable design, long battery life, and robust security features, it's the perfect business companion for professionals.",
                         true,
                         List.of("Black"),
                         1.5,
                         1.68,
                         AppConstants.laptopCategory,
                         "Windows 11",
                         "Intel Core i7",
                         List.of("8GB", "16GB", "32GB"),
                         List.of("256GB SSD", "512GB SSD", "1TB SSD"),
                         "Up to 15 hours",
                         "Integrated"));

         // waching machine
         homeAppliances.add(new HomeAppliances(
                         "Front Load Washing Machine",
                         "Samsung",
                         70,
                         34999.99, // Price in INR
                         8,
                         "Effortlessly clean your clothes with the Samsung Front Load Washing Machine. With its eco-friendly design, multiple wash programs, and advanced features like bubble soak and eco drum clean, it ensures thorough and gentle cleaning for all types of fabrics.",
                         true,
                         List.of("White", "Silver"),
                         2.0, // Warranty in years
                         60, // Weight in kilograms
                         "7 kg", // Capacity
                         "85cm x 60cm x 55cm", // Dimensions
                         AppConstants.wachingMachineCategory // Type
         ));

         homeAppliances.add(new HomeAppliances(
                         "Top Load Washing Machine",
                         "LG",
                         60,
                         27999.99, // Price in INR
                         7,
                         "Simplify your laundry routine with the LG Top Load Washing Machine. With its TurboDrum technology, smart inverter motor, and auto restart feature, it offers efficient and convenient washing performance while saving energy and water.",
                         true,
                         List.of("White"),
                         2.0, // Warranty in years
                         40, // Weight in kilograms
                         "6.5 kg", // Capacity
                         "80cm x 55cm x 55cm", // Dimensions
                         AppConstants.wachingMachineCategory // Type
         ));

         homeAppliances.add(new HomeAppliances(
                         "Semi-Automatic Washing Machine",
                         "Whirlpool",
                         50,
                         18999.99, // Price in INR
                         6,
                         "Experience versatility with the Whirlpool Semi-Automatic Washing Machine. With its dual wash system, powerful motor, and smart scrub station, it offers efficient cleaning performance while giving you control over the washing process.",
                         true,
                         List.of("Blue"),
                         2.0, // Warranty in years
                         35, // Weight in kilograms
                         "7.5 kg", // Capacity
                         "85cm x 60cm x 45cm", // Dimensions
                         AppConstants.wachingMachineCategory // Type
         ));

         homeAppliances.add(new HomeAppliances(
                         "Fully-Automatic Front Load Washing Machine",
                         "Bosch",
                         80,
                         41999.99, // Price in INR
                         9,
                         "Enjoy hassle-free laundry with the Bosch Fully-Automatic Front Load Washing Machine. With its intelligent sensor technology, anti-vibration design, and multiple wash programs, it delivers superior cleaning performance with minimal noise and vibration.",
                         true,
                         List.of("Silver"),
                         2.5, // Warranty in years
                         65, // Weight in kilograms
                         "8 kg", // Capacity
                         "85cm x 60cm x 60cm", // Dimensions
                         AppConstants.wachingMachineCategory // Type
         ));

         homeAppliances.add(new HomeAppliances(
                         "Portable Mini Washing Machine",
                         "Della",
                         30,
                         7999.99, // Price in INR
                         5,
                         "Get laundry done anywhere with the Della Portable Mini Washing Machine. With its compact and lightweight design, easy-to-use controls, and quick washing cycle, it's perfect for small spaces, RVs, and camping trips.",
                         true,
                         List.of("White"),
                         1.0, // Warranty in years
                         10, // Weight in kilograms
                         "3.5 kg", // Capacity
                         "50cm x 35cm x 35cm", // Dimensions
                         AppConstants.wachingMachineCategory // Type
         ));

         homeAppliances.add(new HomeAppliances(
                         "Twin Tub Washing Machine",
                         "Haier",
                         40,
                         14999.99, // Price in INR
                         6,
                         "Experience convenience and flexibility with the Haier Twin Tub Washing Machine. With its dual tub design, separate wash and spin cycles, and compact size, it's ideal for small households or areas with limited space.",
                         true,
                         List.of("White"),
                         1.5, // Warranty in years
                         25, // Weight in kilograms
                         "5.5 kg", // Capacity
                         "75cm x 50cm x 45cm", // Dimensions
                         AppConstants.wachingMachineCategory // Type
         ));

         homeAppliances.add(new HomeAppliances(
                         "Smart Washing Machine with Wi-Fi Connectivity",
                         "LG",
                         90,
                         45999.99, // Price in INR
                         8,
                         "Bring convenience to your laundry routine with the LG Smart Washing Machine. With built-in Wi-Fi connectivity, you can control and monitor your laundry remotely using your smartphone. Plus, with features like AI DD and TurboWash 360, it delivers powerful and efficient cleaning performance.",
                         true,
                         List.of("Graphite Steel"),
                         2.0, // Warranty in years
                         55, // Weight in kilograms
                         "8 kg", // Capacity
                         "85cm x 60cm x 60cm", // Dimensions
                         AppConstants.wachingMachineCategory // Type
         ));

         homeAppliances.add(new HomeAppliances(
                         "Compact Front Load Washer",
                         "Whirlpool",
                         50,
                         32999.99, // Price in INR
                         7,
                         "Save space without compromising performance with the Whirlpool Compact Front Load Washer. With its slim design and stackable configuration, it's perfect for apartments or small laundry rooms. Despite its compact size, it offers powerful cleaning performance and advanced features for a hassle-free laundry experience.",
                         true,
                         List.of("White"),
                         2.0, // Warranty in years
                         50, // Weight in kilograms
                         "6 kg", // Capacity
                         "80cm x 55cm x 45cm", // Dimensions
                         AppConstants.wachingMachineCategory // Type
         ));

         homeAppliances.add(new HomeAppliances(
                         "Steam Washing Machine",
                         "Samsung",
                         70,
                         38999.99, // Price in INR
                         8,
                         "Achieve superior cleaning results with the Samsung Steam Washing Machine. With its steam wash technology, it penetrates deep into fabrics to remove tough stains and allergens, while also reducing wrinkles and odors. Plus, with features like EcoBubble and QuickDrive, it delivers efficient and gentle cleaning performance.",
                         true,
                         List.of("White"),
                         2.5, // Warranty in years
                         60, // Weight in kilograms
                         "7 kg", // Capacity
                         "85cm x 60cm x 55cm", // Dimensions
                         AppConstants.wachingMachineCategory // Type
         ));

         homeAppliances.add(new HomeAppliances(
                         "Heavy Duty Industrial Washing Machine",
                         "IFB",
                         20,
                         69999.99, // Price in INR
                         10,
                         "Meet the demands of commercial laundry with the IFB Heavy Duty Industrial Washing Machine. With its robust construction, large capacity, and advanced features like auto imbalance vibration control and water-saving technology, it's designed to handle heavy loads and deliver reliable performance in industrial settings.",
                         true,
                         List.of("Stainless Steel"),
                         3.0, // Warranty in years
                         150, // Weight in kilograms
                         "15 kg", // Capacity
                         "110cm x 80cm x 70cm", // Dimensions
                         AppConstants.wachingMachineCategory // Type
         ));

         // fridge
         homeAppliances.add(new HomeAppliances(
                         "French Door Refrigerator",
                         "Samsung",
                         80,
                         84999.99, // Price in INR
                         8,
                         "Upgrade your kitchen with the Samsung French Door Refrigerator. With its spacious design, flexible storage options, and advanced cooling technology, it's perfect for large families or avid entertainers. Features like FlexZone and Twin Cooling Plus ensure optimal freshness and convenience.",
                         true,
                         List.of("Stainless Steel", "Black Stainless Steel"),
                         2.0, // Warranty in years
                         120, // Weight in kilograms
                         "600 liters", // Capacity
                         "180cm x 90cm x 70cm", // Dimensions
                         AppConstants.fridgeCategory // Type
         ));

         homeAppliances.add(new HomeAppliances(
                         "Side-by-Side Refrigerator",
                         "LG",
                         100,
                         73999.99, // Price in INR
                         7,
                         "Maximize storage space and organization with the LG Side-by-Side Refrigerator. Featuring a sleek design and innovative features like InstaView Door-in-Door and DoorCooling+, it offers quick and easy access to your favorite foods while maintaining optimal freshness.",
                         true,
                         List.of("Platinum Silver", "Graphite Steel"),
                         2.0, // Warranty in years
                         110, // Weight in kilograms
                         "550 liters", // Capacity
                         "175cm x 85cm x 70cm", // Dimensions
                         AppConstants.fridgeCategory // Type
         ));

         homeAppliances.add(new HomeAppliances(
                         "Bottom Freezer Refrigerator",
                         "Whirlpool",
                         70,
                         59999.99, // Price in INR
                         6,
                         "Experience convenience and efficiency with the Whirlpool Bottom Freezer Refrigerator. With its bottom-mounted freezer, ergonomic design, and adaptive intelligence technology, it provides easy access to fresh foods while reducing energy consumption.",
                         true,
                         List.of("White", "Stainless Steel"),
                         1.5, // Warranty in years
                         90, // Weight in kilograms
                         "400 liters", // Capacity
                         "165cm x 70cm x 65cm", // Dimensions
                         AppConstants.fridgeCategory // Type
         ));

         homeAppliances.add(new HomeAppliances(
                         "Single Door Refrigerator",
                         "Godrej",
                         50,
                         34999.99, // Price in INR
                         5,
                         "Simplify your kitchen with the Godrej Single Door Refrigerator. With its compact size, energy-efficient performance, and advanced cooling technology, it's perfect for small households or as a secondary fridge. Features like Cool Shower Technology ensure uniform cooling for all your groceries.",
                         true,
                         List.of("Silver Strokes", "Royal Blue"),
                         1.0, // Warranty in years
                         60, // Weight in kilograms
                         "250 liters", // Capacity
                         "145cm x 55cm x 60cm", // Dimensions
                         AppConstants.fridgeCategory // Type
         ));

         homeAppliances.add(new HomeAppliances(
                         "Convertible Refrigerator",
                         "Haier",
                         60,
                         44999.99, // Price in INR
                         6,
                         "Adapt to your changing storage needs with the Haier Convertible Refrigerator. Featuring a flexible design, adjustable shelves, and dual-fan cooling, it allows you to switch between fridge and freezer modes to maximize space and efficiency. Perfect for busy households or seasonal storage.",
                         true,
                         List.of("Brushline Silver", "Dazzle Steel"),
                         1.5, // Warranty in years
                         80, // Weight in kilograms
                         "350 liters", // Capacity
                         "160cm x 65cm x 70cm", // Dimensions
                         AppConstants.fridgeCategory // Type
         ));

         // ac
         homeAppliances.add(new HomeAppliances(
                         "Split Air Conditioner",
                         "Voltas",
                         150,
                         39999.99, // Price in INR
                         8,
                         "Stay cool and comfortable all summer long with the Voltas Split Air Conditioner. Featuring high-efficiency cooling, turbo mode, and eco-friendly refrigerants, it ensures rapid cooling and energy savings. With its sleek design and advanced features like sleep mode and auto restart, it's perfect for any room in your home.",
                         true,
                         List.of("White", "Silver"),
                         1.5, // Warranty in years
                         50, // Weight in kilograms
                         "1.5 ton", // Capacity
                         "90cm x 30cm x 20cm", // Dimensions
                         AppConstants.acCategory // Type
         ));

         homeAppliances.add(new HomeAppliances(
                         "Window Air Conditioner",
                         "LG",
                         100,
                         29999.99, // Price in INR
                         7,
                         "Beat the heat with the LG Window Air Conditioner. Designed for easy installation and powerful cooling, it features a compact design, multiple cooling modes, and energy-saving features like auto restart and sleep mode. With its intuitive controls and durable build, it's the perfect solution for cooling smaller spaces.",
                         true,
                         List.of("White", "Black"),
                         1.5, // Warranty in years
                         40, // Weight in kilograms
                         "1 ton", // Capacity
                         "65cm x 45cm x 30cm", // Dimensions
                         AppConstants.acCategory // Type
         ));

         homeAppliances.add(new HomeAppliances(
                         "Portable Air Conditioner",
                         "Blue Star",
                         80,
                         44999.99, // Price in INR
                         6,
                         "Stay cool wherever you go with the Blue Star Portable Air Conditioner. Featuring easy portability, quick installation, and powerful cooling performance, it's perfect for rooms without traditional AC installation. With its compact design and user-friendly controls, it offers convenience and comfort on the move.",
                         true,
                         List.of("White"),
                         1.0, // Warranty in years
                         35, // Weight in kilograms
                         "1.5 ton", // Capacity
                         "75cm x 40cm x 35cm", // Dimensions
                         AppConstants.acCategory // Type
         ));

         homeAppliances.add(new HomeAppliances(
                         "Inverter Air Conditioner",
                         "Daikin",
                         120,
                         44999.99, // Price in INR
                         6,
                         "Experience energy-efficient cooling with the Daikin Inverter Air Conditioner. Powered by advanced inverter technology, it provides precise temperature control, rapid cooling, and quiet operation. With its sleek design and intelligent features like self-diagnosis and power chill mode, it ensures maximum comfort with minimal energy consumption.",
                         true,
                         List.of("White", "Silver"),
                         1.5, // Warranty in years
                         55, // Weight in kilograms
                         "1.5 ton", // Capacity
                         "100cm x 35cm x 25cm", // Dimensions
                         AppConstants.acCategory // Type
         ));

         homeAppliances.add(new HomeAppliances(
                         "Cassette Air Conditioner",
                         "Carrier",
                         90,
                         64999.99, // Price in INR
                         7,
                         "Enjoy discreet and efficient cooling with the Carrier Cassette Air Conditioner. Designed for commercial spaces and large rooms, it features a compact cassette design, powerful cooling performance, and customizable airflow options. With its advanced features like 4-way swing and timer function, it delivers superior comfort and convenience.",
                         true,
                         List.of("White"),
                         2.0, // Warranty in years
                         65, // Weight in kilograms
                         "2 ton", // Capacity
                         "120cm x 60cm x 30cm", // Dimensions
                         AppConstants.acCategory // Type
         ));

         // watches
         wearables.add(new Wearable(
                         "Smartwatch Series 6",
                         "Apple",
                         200,
                         34999.99, // Price in INR
                         10,
                         "Stay connected and stay healthy with the Apple Smartwatch Series 6. Featuring advanced health monitoring, GPS, and cellular connectivity, it's your ultimate fitness and communication companion. With its always-on Retina display and water resistance, it's perfect for any activity, indoors or outdoors.",
                         true,
                         List.of("Space Gray", "Silver", "Gold"),
                         1.5, // Warranty in years
                         0.082, // Weight in kilograms
                         "Heart rate sensor, Blood oxygen sensor, Accelerometer, Gyroscope, Ambient light sensor",
                         "Bluetooth, Wi-Fi, Cellular",
                         "Built-in rechargeable lithium-ion battery",
                         AppConstants.watchCategory // Type
         ));

         wearables.add(new Wearable(
                         "Galaxy Watch 4",
                         "Samsung",
                         150,
                         27999.99, // Price in INR
                         8,
                         "Experience style and functionality with the Samsung Galaxy Watch 4. Featuring a sleek design, AMOLED display, and advanced health tracking, it's your perfect fitness and fashion accessory. With its long-lasting battery life and seamless integration with your Galaxy devices, it keeps you connected and organized throughout the day.",
                         true,
                         List.of("Black", "Silver", "Pink Gold"),
                         1.5, // Warranty in years
                         0.051, // Weight in kilograms
                         "Heart rate sensor, Blood pressure sensor, ECG, Accelerometer, Gyroscope, Barometer, Ambient light sensor",
                         "Bluetooth, Wi-Fi",
                         "Built-in rechargeable lithium-ion battery",
                         AppConstants.watchCategory // Type
         ));

         wearables.add(new Wearable(
                         "Fitbit Versa 3",
                         "Fitbit",
                         120,
                         19999.99, // Price in INR
                         7,
                         "Track your fitness and wellness with the Fitbit Versa 3. Featuring built-in GPS, heart rate monitoring, and sleep tracking, it helps you stay on top of your health goals. With its sleek design, customizable clock faces, and long battery life, it's the perfect blend of style and functionality.",
                         true,
                         List.of("Black", "Midnight Blue", "Pink Clay"),
                         1.0, // Warranty in years
                         0.038, // Weight in kilograms
                         "Heart rate sensor, SpO2 sensor, Accelerometer, Gyroscope, Ambient light sensor",
                         "Bluetooth, Wi-Fi, GPS",
                         "Built-in rechargeable lithium-ion battery",
                         AppConstants.watchCategory // Type
         ));

         wearables.add(new Wearable(
                         "Garmin Fenix 6",
                         "Garmin",
                         100,
                         39999.99, // Price in INR
                         8,
                         "Conquer the outdoors with the Garmin Fenix 6. Featuring rugged construction, multi-GNSS support, and advanced performance metrics, it's your ultimate outdoor adventure companion. With its long battery life, topographic maps, and heart rate monitoring, it's perfect for hiking, running, and exploring.",
                         true,
                         List.of("Black", "Silver", "Titanium"),
                         2.0, // Warranty in years
                         0.083, // Weight in kilograms
                         "Heart rate sensor, Pulse oximeter, Accelerometer, Gyroscope, Barometric altimeter, Compass, Thermometer",
                         "Bluetooth, Wi-Fi, GPS, GLONASS, Galileo",
                         "Built-in rechargeable lithium-ion battery",
                         AppConstants.watchCategory // Type
         ));

         wearables.add(new Wearable(
                         "Huawei Watch GT 2 Pro",
                         "Huawei",
                         80,
                         25999.99, // Price in INR
                         6,
                         "Experience elegance and performance with the Huawei Watch GT 2 Pro. Featuring premium materials, AMOLED display, and advanced health tracking, it's the perfect blend of style and functionality. With its long-lasting battery life and built-in GPS, it's your ideal companion for fitness and everyday life.",
                         true,
                         List.of("Night Black", "Nebula Grey"),
                         1.5, // Warranty in years
                         0.052, // Weight in kilograms
                         "Heart rate sensor, SpO2 sensor, Accelerometer, Gyroscope, Barometer, Compass, Ambient light sensor",
                         "Bluetooth, GPS",
                         "Built-in rechargeable lithium-ion battery",
                         AppConstants.watchCategory // Type
         ));

         // earphones
         wearables.add(new Wearable(
                         "Sony WF-1000XM4",
                         "Sony",
                         50,
                         21999.99, // Price in INR
                         5,
                         "Immerse yourself in music with the Sony WF-1000XM4 earbuds. Featuring industry-leading noise cancellation, Hi-Res Audio, and up to 8 hours of playback, they deliver an unparalleled listening experience. With their ergonomic design and IPX4 water resistance, they're perfect for everyday use.",
                         true,
                         List.of("Black", "Silver"),
                         1.0, // Warranty in years
                         0.008, // Weight in kilograms
                         "Active noise cancellation",
                         "Bluetooth 5.2",
                         "Up to 8 hours (ANC on)",
                         AppConstants.earPhoneCategory // Type
         ));

         wearables.add(new Wearable(
                         "Apple AirPods Pro",
                         "Apple",
                         80,
                         18999.99, // Price in INR
                         8,
                         "Experience the magic of AirPods Pro with adaptive EQ, active noise cancellation, and transparency mode. With their customizable fit, sweat and water resistance, and spatial audio, they're the perfect companion for your Apple devices. Enjoy up to 4.5 hours of listening time on a single charge.",
                         true,
                         List.of("White"),
                         1.0, // Warranty in years
                         0.005, // Weight in kilograms
                         "Active noise cancellation",
                         "Bluetooth 5.0",
                         "Up to 4.5 hours (ANC on)",
                         AppConstants.earPhoneCategory // Type
         ));

         wearables.add(new Wearable(
                         "Bose QuietComfort Earbuds",
                         "Bose",
                         60,
                         23999.99, // Price in INR
                         10,
                         "Enjoy peace and quiet with the Bose QuietComfort Earbuds. Featuring world-class noise cancellation, comfortable ear tips, and intuitive touch controls, they're designed for all-day comfort and immersion. With their sweat and weather resistance, they're perfect for workouts and commutes.",
                         true,
                         List.of("Black", "White"),
                         1.0, // Warranty in years
                         0.008, // Weight in kilograms
                         "Active noise cancellation",
                         "Bluetooth 5.1",
                         "Up to 6 hours (ANC on)",
                         AppConstants.earPhoneCategory // Type
         ));

         wearables.add(new Wearable(
                         "Jabra Elite 85t",
                         "Jabra",
                         70,
                         15999.99, // Price in INR
                         7,
                         "Enjoy exceptional sound quality with the Jabra Elite 85t earbuds. Featuring adjustable active noise cancellation, HearThrough technology, and up to 7 hours of battery life, they provide an immersive listening experience. With their compact design and secure fit, they're perfect for daily use.",
                         true,
                         List.of("Titanium Black", "Gold Beige"),
                         1.0, // Warranty in years
                         0.007, // Weight in kilograms
                         "Active noise cancellation",
                         "Bluetooth 5.1",
                         "Up to 7 hours (ANC on)",
                         AppConstants.earPhoneCategory // Type
         ));

         wearables.add(new Wearable(
                         "Samsung Galaxy Buds Pro",
                         "Samsung",
                         90,
                         16999.99, // Price in INR
                         6,
                         "Experience crystal-clear sound with the Samsung Galaxy Buds Pro. Featuring intelligent active noise cancellation, immersive sound by AKG, and water resistance, they provide an elevated listening experience. With their comfortable fit and long-lasting battery life, they're perfect for all-day wear.",
                         true,
                         List.of("Phantom Black", "Phantom Silver", "Phantom Violet"),
                         1.0, // Warranty in years
                         0.006, // Weight in kilograms
                         "Active noise cancellation",
                         "Bluetooth 5.0",
                         "Up to 5 hours (ANC on)",
                         AppConstants.earPhoneCategory // Type
         ));

         // earbuds
         wearables.add(new Wearable(
                         "Samsung Galaxy Buds Live",
                         "Samsung",
                         60,
                         11999.99, // Price in INR
                         5,
                         "Experience exceptional sound with the Samsung Galaxy Buds Live. Featuring AKG-tuned sound, Active Noise Cancellation, and long-lasting battery life, they provide immersive audio in a sleek, bean-shaped design. With their comfortable fit and touch controls, they're perfect for daily use.",
                         true,
                         List.of("Mystic Black", "Mystic Bronze", "Mystic White"),
                         1.0, // Warranty in years
                         0.005, // Weight in kilograms
                         "Active Noise Cancellation",
                         "Bluetooth 5.0",
                         "Up to 8 hours (ANC on)",
                         AppConstants.earBudsCategory // Type
         ));

         wearables.add(new Wearable(
                         "Sony WF-SP800N",
                         "Sony",
                         50,
                         13999.99, // Price in INR
                         8,
                         "Stay active with the Sony WF-SP800N earbuds. Featuring Extra Bass, digital noise cancellation, and IP55 water resistance, they deliver powerful sound in any environment. With their secure fit and long battery life, they're perfect for workouts and outdoor activities.",
                         true,
                         List.of("Black", "Blue", "White"),
                         1.0, // Warranty in years
                         0.008, // Weight in kilograms
                         "Digital Noise Cancellation",
                         "Bluetooth 5.0",
                         "Up to 9 hours (ANC on)",
                         AppConstants.earBudsCategory // Type
         ));

         wearables.add(new Wearable(
                         "JBL Free X",
                         "JBL",
                         40,
                         8999.99, // Price in INR
                         6,
                         "Enjoy wireless freedom with the JBL Free X earbuds. Featuring JBL Signature Sound, hands-free calling, and up to 24 hours of combined playback, they provide immersive audio all day long. With their ergonomic design and intuitive controls, they're perfect for everyday use.",
                         true,
                         List.of("Black", "White"),
                         1.0, // Warranty in years
                         0.006, // Weight in kilograms
                         "Passive Noise Cancellation",
                         "Bluetooth 4.2",
                         "Up to 4 hours",
                         AppConstants.earBudsCategory // Type
         ));

         wearables.add(new Wearable(
                         "Bose SoundSport Free",
                         "Bose",
                         70,
                         12999.99, // Price in INR
                         7,
                         "Stay motivated with the Bose SoundSport Free earbuds. Featuring StayHear+ Sport tips, sweat and weather resistance, and up to 5 hours of battery life, they're designed for active lifestyles. With their clear sound and reliable connectivity, they're perfect for workouts and outdoor adventures.",
                         true,
                         List.of("Black", "Midnight Blue", "Bright Orange"),
                         1.0, // Warranty in years
                         0.010, // Weight in kilograms
                         "Passive Noise Isolation",
                         "Bluetooth 4.1",
                         "Up to 5 hours",
                         AppConstants.earBudsCategory // Type
         ));
         // headphones
         wearables.add(new Wearable(
                         "Sony WH-1000XM4",
                         "Sony",
                         50,
                         24999.99, // Price in INR
                         10,
                         "Immerse yourself in music with the Sony WH-1000XM4 headphones. Featuring industry-leading noise cancellation, high-resolution audio, and up to 30 hours of battery life, they deliver premium sound quality and all-day comfort. With their intuitive touch controls and smart features, they're perfect for music lovers and travelers alike.",
                         true,
                         List.of("Black", "Silver"),
                         1.0, // Warranty in years
                         0.254, // Weight in kilograms
                         "Active Noise Cancellation",
                         "Bluetooth 5.0",
                         "Up to 30 hours (ANC on)",
                         AppConstants.headPhoneCategory // Type
         ));

         wearables.add(new Wearable(
                         "Bose QuietComfort 35 II",
                         "Bose",
                         60,
                         29999.99, // Price in INR
                         8,
                         "Experience tranquility with the Bose QuietComfort 35 II headphones. Featuring world-class noise cancellation, balanced sound, and Alexa voice control, they provide a serene listening experience anywhere you go. With their lightweight design and long battery life, they're perfect for long flights and commutes.",
                         true,
                         List.of("Black", "Silver", "Rose Gold"),
                         1.0, // Warranty in years
                         0.235, // Weight in kilograms
                         "Active Noise Cancellation",
                         "Bluetooth 4.2",
                         "Up to 20 hours (ANC on)",
                         AppConstants.headPhoneCategory // Type
         ));

         wearables.add(new Wearable(
                         "Sennheiser HD 450BT",
                         "Sennheiser",
                         40,
                         19999.99, // Price in INR
                         6,
                         "Enjoy superior sound with the Sennheiser HD 450BT headphones. Featuring deep bass, active noise cancellation, and voice assistant support, they deliver immersive audio for music and calls. With their comfortable fit and long-lasting battery, they're perfect for everyday use.",
                         true,
                         List.of("Black", "White"),
                         1.0, // Warranty in years
                         0.238, // Weight in kilograms
                         "Active Noise Cancellation",
                         "Bluetooth 5.0",
                         "Up to 30 hours (ANC on)",
                         AppConstants.headPhoneCategory // Type
         ));

         wearables.add(new Wearable(
                         "Beats Studio3 Wireless",
                         "Beats",
                         70,
                         32999.99, // Price in INR
                         7,
                         "Feel your music with the Beats Studio3 Wireless headphones. Featuring Pure Adaptive Noise Cancelling, Apple W1 chip, and real-time audio calibration, they deliver premium sound quality and seamless connectivity. With their iconic design and all-day comfort, they're perfect for music enthusiasts and commuters.",
                         true,
                         List.of("Matte Black", "Shadow Gray", "Midnight Black"),
                         1.0, // Warranty in years
                         0.260, // Weight in kilograms
                         "Active Noise Cancellation",
                         "Bluetooth 5.0",
                         "Up to 22 hours (ANC on)",
                         AppConstants.headPhoneCategory // Type
         ));
         wearables.add(new Wearable(
                         "Jabra Elite 85h",
                         "Jabra",
                         55,
                         22999.99, // Price in INR
                         9,
                         "Experience premium sound quality with the Jabra Elite 85h headphones. Featuring SmartSound technology, active noise cancellation, and up to 36 hours of battery life, they deliver exceptional audio performance and comfort. With their durable design and customizable EQ settings, they're perfect for music lovers and frequent travelers.",
                         true,
                         List.of("Black", "Navy", "Titanium Black"),
                         1.0, // Warranty in years
                         0.296, // Weight in kilograms
                         "Active Noise Cancellation",
                         "Bluetooth 5.0",
                         "Up to 36 hours (ANC on)",
                         AppConstants.headPhoneCategory // Type
         ));

         wearables.add(new Wearable(
                         "Audio-Technica ATH-M50x",
                         "Audio-Technica",
                         65,
                         15999.99, // Price in INR
                         7,
                         "Enjoy professional audio quality with the Audio-Technica ATH-M50x headphones. Featuring large aperture drivers, robust construction, and exceptional sound isolation, they deliver studio-quality sound with enhanced clarity and accuracy. With their swiveling earcups and detachable cables, they're perfect for studio monitoring and everyday listening.",
                         true,
                         List.of("Black", "White", "Blue"),
                         1.0, // Warranty in years
                         0.285, // Weight in kilograms
                         "Passive Noise Isolation",
                         "Wired (3.5mm)",
                         "N/A",
                         AppConstants.headPhoneCategory // Type
         ));

 }

	
	public List<MobileAndLaptops> getAllMobilieAndLaptops() {
		return mobileAndLaptops;
	}
	
	public List<HomeAppliances>  getAllHomeAppliances(){
		return homeAppliances;
	}
	
	public List<Wearable> getAllWearables(){
		return wearables;
	}
	
	public List<MobileAndLaptops> getMobileAndLaptopsByType(String type) {
		List<MobileAndLaptops> ans = new ArrayList<>();
		
		for(MobileAndLaptops ml: mobileAndLaptops) {
			if(ml.getType().equals(type)) {
				ans.add(ml);
			}
		}
		return ans;
	}
	
	public List<HomeAppliances> getHomeAppliancesByType(String type) {
		List<HomeAppliances> ans = new ArrayList<>();
		
		for(HomeAppliances h: homeAppliances) {
			if(h.getType().equals(type)) {
				ans.add(h);
			}
		}
		return ans;
	}
	
	public List<Wearable> getWearableByType(String type) {
		List<Wearable> ans = new ArrayList<>();
		
		for(Wearable w: wearables) {
			if(w.getType().equals(type)) {
				ans.add(w);
			}
		}
		return ans;
	}
	
	
}
