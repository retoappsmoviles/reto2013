//
//  ViewController.h
//  reto02
//
//  Created by carlos on 9/28/13.
//  Copyright (c) 2013 carlos. All rights reserved.
//

#import <UIKit/UIKit.h>

@interface ViewController : UIViewController <UITextFieldDelegate>

@property (weak, nonatomic) IBOutlet UILabel *nameLabel;
@property (weak, nonatomic) IBOutlet UILabel *surnameLabel;
@property (weak, nonatomic) IBOutlet UILabel *label;
@property (weak, nonatomic) IBOutlet UITextField *nameText;
@property (weak, nonatomic) IBOutlet UITextField *surnameText;

- (IBAction)pushButton:(id)sender;
- (IBAction)hiddeKeyboard:(id)sender;

@end
